import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	VersionModelParser version_parser = new VersionModelParser();
	SociallinksModelParser sociallinks_parser;
	CopyrightModelParser copyright_parser = new CopyrightModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				local_model = new RootModel(jsobj.getString("background_image"), jsobj.getInt("id"), call_for_papers, jsobj.getString("code_of_conduct"), jsobj.getString("email"), jsobj.getString("topic"), creatorEmail, jsobj.getString("organizer_description"), jsobj.getString("privacy"), version, jsobj.getString("description"), jsobj.getString("state"), jsobj.getString("name"), sociallinkss, jsobj.getString("end_time"), jsobj.getString("starttime"), jsobj.getString("schedule_published_on"), jsobj.getString("type"), jsobj.getString("location_name"), jsobj.getString("organizer_name"), jsobj.getString("logo"), copyright, jsobj.getString("timezone"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}