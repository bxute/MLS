import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	AdeesModelParser adees_parser = new AdeesModelParser();
	Social_linksModelParser social_links_parser;
	CreatorModelParser creator_parser = new CreatorModelParser();
	VersionModelParser version_parser = new VersionModelParser();

	public CopModelParser() {
		social_links_parser = new Social_linksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
			JSONArray social_links_arr = jsobj.getJSONArray("social_links");

			for (int i = 0; i < social_links_arr.length(); i++) {

				social_linkss.add(social_links_parser.parseSocial_linksModel((String) social_links_arr.get(i)));

			}

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			local_model = new CopModel(jsobj.getString("description"), jsobj.getString("organizer_description"), jsobj.getInt("tracks_ver"), jsobj.getString("email"), jsobj.getString("schedule_published_on"), adees, jsobj.getString("organizer_name"), social_linkss, jsobj.getString("logo"), creator, jsobj.getString("start_time"), jsobj.getInt("sponsors_ver"), jsobj.getString("state"), jsobj.getString("privacy"), jsobj.getString("location_name"), jsobj.getString("time_zone"), jsobj.getString("type"), jsobj.getString("end_time"), jsobj.getString("topic"), jsobj.getInt("speakers_ver"), jsobj.getInt("id"), version, jsobj.getString("name"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}