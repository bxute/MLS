import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	SociallinksModelParser sociallinks_parser;
	VersionModelParser version_parser = new VersionModelParser();
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	CopyrightModelParser copyright_parser = new CopyrightModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				local_model = new RootModel(call_for_papers, sociallinkss, jsobj.getString("starttime"), jsobj.getString("email"), jsobj.getString("schedule_published_on"), jsobj.getString("code_of_conduct"), jsobj.getString("background_image"), jsobj.getString("privacy"), jsobj.getString("organizer_description"), version, flxwm, creatorEmail, jsobj.getString("organizer_name"), copyright, jsobj.getString("type"), jsobj.getString("description"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}