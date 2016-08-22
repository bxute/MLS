import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	SociallinksModelParser sociallinks_parser;
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	VersionModelParser version_parser = new VersionModelParser();
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	CopyrightModelParser copyright_parser = new CopyrightModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				local_model = new RootModel(jsobj.getString("privacy"), creatorEmail, jsobj.getString("code_of_conduct"), jsobj.getString("background_image"), jsobj.getString("organizer_name"), sociallinkss, flxwm, jsobj.getString("starttime"), jsobj.getString("schedule_published_on"), version, jsobj.getString("organizer_description"), call_for_papers, jsobj.getString("description"), jsobj.getString("email"), jsobj.getString("type"), copyright, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}