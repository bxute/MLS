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

			local_model = new CopModel(jsobj.getString("state"), jsobj.getString("logo"), jsobj.getInt("id"), jsobj.getString("privacy"), jsobj.getString("name"), version, jsobj.getString("type"), jsobj.getString("email"), jsobj.getString("description"), jsobj.getInt("tracks_ver"), jsobj.getString("topic"), jsobj.getInt("sponsors_ver"), jsobj.getString("end_time"), jsobj.getString("organizer_name"), creator, adees, jsobj.getString("organizer_description"), jsobj.getString("schedule_published_on"), jsobj.getString("time_zone"), jsobj.getInt("speakers_ver"), social_linkss, jsobj.getString("start_time"), jsobj.getString("location_name"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}