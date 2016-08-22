import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	Social_linksModelParser social_links_parser;
	VersionModelParser version_parser = new VersionModelParser();
	AdeesModelParser adees_parser = new AdeesModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();

	public CopModelParser() {
		social_links_parser = new Social_linksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
			JSONArray social_links_arr = jsobj.getJSONArray("social_links");

			for (int i = 0; i < social_links_arr.length(); i++) {

				social_linkss.add(social_links_parser.parseSocial_linksModel((String) social_links_arr.get(i)));

			}

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			local_model = new CopModel(jsobj.getString("topic"), jsobj.getInt("id"), jsobj.getString("start_time"), jsobj.getString("organizer_description"), jsobj.getString("logo"), jsobj.getString("name"), jsobj.getInt("tracks_ver"), jsobj.getInt("speakers_ver"), jsobj.getString("type"), jsobj.getString("state"), jsobj.getString("description"), social_linkss, jsobj.getString("schedule_published_on"), jsobj.getString("email"), jsobj.getString("time_zone"), jsobj.getInt("sponsors_ver"), jsobj.getString("privacy"), version, jsobj.getString("organizer_name"), adees, jsobj.getString("end_time"), jsobj.getString("location_name"), creator, );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}