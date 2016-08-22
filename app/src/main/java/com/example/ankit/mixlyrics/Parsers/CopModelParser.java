import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	VersionModelParser version_parser = new VersionModelParser();
	AdeesModelParser adees_parser = new AdeesModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();
	SociallinksModelParser sociallinks_parser;

	public CopModelParser() {
		sociallinks_parser = new SociallinksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
			JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

			for (int i = 0; i < sociallinks_arr.length(); i++) {

				sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

			}

			local_model = new CopModel(jsobj.getString("location_name"), jsobj.getString("start_time"), jsobj.getString("state"), jsobj.getString("schedulepublished_on"), jsobj.getString("name"), jsobj.getInt("tracks_ver"), jsobj.getInt("speakers_ver"), version, adees, jsobj.getString("logo"), creator, jsobj.getString("organizer_name"), sociallinkss, jsobj.getInt("sponsors_ver"), jsobj.getString("type"), jsobj.getString("organizer_description"), jsobj.getString("time_zone"), jsobj.getString("email"), jsobj.getInt("id"), jsobj.getString("privacy"), jsobj.getString("description"), jsobj.getString("end_time"), jsobj.getString("topic"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}