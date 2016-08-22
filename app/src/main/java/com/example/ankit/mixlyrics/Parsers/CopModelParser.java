import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	VersionModelParser version_parser = new VersionModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();
	AdeesModelParser adees_parser = new AdeesModelParser();
	Social_linksModelParser social_links_parser;

	public CopModelParser() {
		social_links_parser = new Social_linksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
			JSONArray social_links_arr = jsobj.getJSONArray("social_links");

			for (int i = 0; i < social_links_arr.length(); i++) {

				social_linkss.add(social_links_parser.parseSocial_linksModel((String) social_links_arr.get(i)));

			}

			local_model = new CopModel(jsobj.getString("state"), version, jsobj.getString("start_time"), jsobj.getString("time_zone"), jsobj.getString("organizer_description"), jsobj.getInt("speakers_ver"), jsobj.getString("description"), creator, jsobj.getString("topic"), jsobj.getInt("tracks_ver"), jsobj.getString("privacy"), jsobj.getInt("sponsors_ver"), jsobj.getString("logo"), jsobj.getString("organizer_name"), jsobj.getInt("id"), jsobj.getString("schedule_published_on"), adees, jsobj.getString("location_name"), social_linkss, jsobj.getString("email"), jsobj.getString("type"), jsobj.getString("name"), jsobj.getString("end_time"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
		}
			
}