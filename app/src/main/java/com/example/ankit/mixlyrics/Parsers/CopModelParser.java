import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	CreatorModelParser creator_parser = new CreatorModelParser();
	VersionModelParser version_parser = new VersionModelParser();
	SociallinksModelParser sociallinks_parser;
	AdeesModelParser adees_parser = new AdeesModelParser();

	public CopModelParser() {
		sociallinks_parser = new SociallinksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
			JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

			for (int i = 0; i < sociallinks_arr.length(); i++) {

				sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

			}

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			local_model = new CopModel(jsobj.getInt("sponsors_ver"), creator, jsobj.getString("topic"), jsobj.getString("location_name"), jsobj.getString("type"), version, jsobj.getString("privacy"), jsobj.getInt("id"), jsobj.getString("schedulepublished_on"), jsobj.getString("start_time"), jsobj.getString("end_time"), jsobj.getInt("speakers_ver"), jsobj.getString("email"), jsobj.getString("organizer_description"), jsobj.getString("time_zone"), jsobj.getString("description"), sociallinkss, jsobj.getString("organizer_name"), jsobj.getString("state"), adees, jsobj.getString("logo"), jsobj.getString("name"), jsobj.getInt("tracks_ver"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}