import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	VersionModelParser version_parser = new VersionModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();
	SociallinksModelParser sociallinks_parser;
	AdeesModelParser adees_parser = new AdeesModelParser();

	public CopModelParser() {
		sociallinks_parser = new SociallinksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
			JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

			for (int i = 0; i < sociallinks_arr.length(); i++) {

				sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

			}

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			local_model = new CopModel(jsobj.getString("type"), jsobj.getString("end_time"), jsobj.getString("topic"), jsobj.getString("email"), jsobj.getString("schedulepublished_on"), jsobj.getString("organizer_description"), jsobj.getInt("speakers_ver"), jsobj.getString("privacy"), jsobj.getString("location_name"), jsobj.getString("state"), version, jsobj.getInt("id"), jsobj.getString("organizer_name"), jsobj.getString("name"), jsobj.getString("description"), jsobj.getInt("tracks_ver"), creator, jsobj.getString("time_zone"), sociallinkss, adees, jsobj.getString("start_time"), jsobj.getString("logo"), jsobj.getInt("sponsors_ver"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}