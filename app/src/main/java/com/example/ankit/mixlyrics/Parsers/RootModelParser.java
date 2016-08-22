import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	VersionModelParser version_parser = new VersionModelParser();
	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	SociallinksModelParser sociallinks_parser;
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				local_model = new RootModel(version, jsobj.getString("description"), copyright, jsobj.getString("organizer_name"), jsobj.getString("schedule_published_on"), jsobj.getString("privacy"), call_for_papers, jsobj.getString("background_image"), jsobj.getString("starttime"), jsobj.getString("organizer_description"), jsobj.getString("type"), sociallinkss, jsobj.getString("email"), jsobj.getString("code_of_conduct"), creatorEmail, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}