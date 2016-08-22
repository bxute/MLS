import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	SociallinksModelParser sociallinks_parser;
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	VersionModelParser version_parser = new VersionModelParser();
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	CopyrightModelParser copyright_parser = new CopyrightModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				local_model = new RootModel(sociallinkss, jsobj.getString("email"), jsobj.getString("description"), call_for_papers, jsobj.getString("background_image"), jsobj.getString("type"), creatorEmail, version, flxwm, jsobj.getString("organizer_description"), jsobj.getString("code_of_conduct"), jsobj.getString("schedule_published_on"), jsobj.getString("starttime"), jsobj.getString("privacy"), jsobj.getString("organizer_name"), copyright, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}