import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	SociallinksModelParser sociallinks_parser;
	VersionModelParser version_parser = new VersionModelParser();
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	FullModelParser full_parser = new FullModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				FullModel full = full_parser.parseFullModel(jsobj.getJSONObject("full").toString());

				local_model = new RootModel(creatorEmail, copyright, sociallinkss, jsobj.getString("description"), jsobj.getString("background_image"), version, call_for_papers, jsobj.getString("type"), jsobj.getString("organizer_name"), jsobj.getString("code_of_conduct"), jsobj.getString("schedule_published_on"), jsobj.getString("starttime"), jsobj.getString("privacy"), full, jsobj.getString("organizer_description"), jsobj.getString("email"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}