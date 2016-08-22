import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	SociallinksModelParser sociallinks_parser;
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	VersionModelParser version_parser = new VersionModelParser();
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

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				local_model = new RootModel(jsobj.getString("background_image"), jsobj.getString("organizer_description"), jsobj.getString("email"), jsobj.getString("schedule_published_on"), jsobj.getString("topic"), jsobj.getString("organizer_name"), jsobj.getString("name"), jsobj.getString("code_of_conduct"), jsobj.getString("description"), sociallinkss, jsobj.getString("end_time"), jsobj.getString("starttime"), call_for_papers, jsobj.getString("location_name"), jsobj.getString("privacy"), creatorEmail, jsobj.getString("logo"), jsobj.getString("state"), jsobj.getString("type"), version, copyright, jsobj.getInt("id"), jsobj.getString("timezone"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}