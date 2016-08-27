import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		VersionModelParser version_parser = new VersionModelParser();
		Social_linksModelParser social_links_parser;
		CreatorModelParser creator_parser = new CreatorModelParser();
		Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
		CopyrightModelParser copyright_parser = new CopyrightModelParser();

		public RootModelParser() {
			social_links_parser = new Social_linksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

					ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
					JSONArray social_links_arr = jsobj.getJSONArray("social_links");
			
					for(int i = 0 ;i<social_links_arr.length();i++){

 						social_linkss.add(social_links_parser.parseSocial_linksModel((String)social_links_arr.get(i)));

					}

					CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

					Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

					CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

					local_model = new RootModel(jsobj.getString("timezone") , jsobj.getString("background_image") , jsobj.getString("topic") , jsobj.getString("description") , version, jsobj.getString("logo") , jsobj.getString("start_time") , jsobj.getString("end_time") , jsobj.getString("organizer_name") , jsobj.getString("code_of_conduct") , social_linkss, jsobj.getString("location_name") , creator, jsobj.getString("name") , jsobj.getString("schedule_published_on") , jsobj.getInt("id") , jsobj.getString("privacy") , jsobj.getString("type") , jsobj.getString("organizer_description") , call_for_papers, copyright, jsobj.getString("email") , jsobj.getString("state") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}