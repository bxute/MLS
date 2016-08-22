import org.json.JSONException;
import org.json.JSONObject;

class VersionModelParser {


	public VersionModelParser() {
	}

	public VersionModel parseVersionModel(String json_object) {

		VersionModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new VersionModel(jsobj.getString("startdate"), jsobj.getString("privacy"), jsobj.getString("end_date"), jsobj.getString("timezone"), jsobj.getInt("tracks_ver"), jsobj.getInt("eventver"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}