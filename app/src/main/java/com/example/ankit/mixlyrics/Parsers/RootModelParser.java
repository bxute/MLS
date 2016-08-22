import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	SociallinksModelParser sociallinks_parser;
	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	Callfor_papersModelParser callfor_papers_parser = new Callfor_papersModelParser();
	VersioningModelParser versioning_parser = new VersioningModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				Callfor_papersModel callfor_papers = callfor_papers_parser.parseCallfor_papersModel(jsobj.getJSONObject("callfor_papers").toString());

				VersioningModel versioning = versioning_parser.parseVersioningModel(jsobj.getJSONObject("versioning").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				local_model = new RootModel(flxwm, jsobj.getString("email"), jsobj.getString("description"), jsobj.getString("schedule_published_on"), jsobj.getString("organizer_description"), call_for_papers, jsobj.getString("type"), sociallinkss, jsobj.getString("background_image"), jsobj.getString("code_of_conduct"), jsobj.getString("privacy"), copyright, callfor_papers, jsobj.getString("starttime"), versioning, creatorEmail, jsobj.getString("organizer_name"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}