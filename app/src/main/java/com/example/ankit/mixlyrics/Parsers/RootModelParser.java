import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	SociallinksModelParser sociallinks_parser;
	VersioningModelParser versioning_parser = new VersioningModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				VersioningModel versioning = versioning_parser.parseVersioningModel(jsobj.getJSONObject("versioning").toString());

				local_model = new RootModel(call_for_papers, jsobj.getString("type"), jsobj.getString("starttime"), jsobj.getString("code_of_conduct"), jsobj.getString("description"), jsobj.getString("background_image"), flxwm, jsobj.getString("email"), creatorEmail, jsobj.getString("organizer_name"), jsobj.getString("organizer_description"), jsobj.getString("schedule_published_on"), copyright, sociallinkss, jsobj.getString("privacy"), versioning, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}