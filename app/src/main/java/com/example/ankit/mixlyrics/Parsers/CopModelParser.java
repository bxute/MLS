import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	AdeesModelParser adees_parser = new AdeesModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();
	SociallinksModelParser sociallinks_parser;
	VersionModelParser version_parser = new VersionModelParser();

	public CopModelParser() {
		sociallinks_parser = new SociallinksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
			JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

			for (int i = 0; i < sociallinks_arr.length(); i++) {

				sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

			}

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			local_model = new CopModel(jsobj.getInt("id"), jsobj.getString("end_time"), adees, jsobj.getString("time_zone"), creator, jsobj.getString("location_name"), jsobj.getString("logo"), jsobj.getInt("sponsors_ver"), jsobj.getString("privacy"), jsobj.getString("state"), jsobj.getInt("tracks_ver"), jsobj.getString("type"), jsobj.getString("email"), jsobj.getInt("speakers_ver"), jsobj.getString("organizer_name"), sociallinkss, version, jsobj.getString("description"), jsobj.getString("name"), jsobj.getString("organizer_description"), jsobj.getString("start_time"), jsobj.getString("topic"), jsobj.getString("schedulepublished_on"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}