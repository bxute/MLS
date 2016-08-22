import org.json.JSONException;
import org.json.JSONObject;

class VersioningModelParser {


	public VersioningModelParser() {
	}

	public VersioningModel parseVersioningModel(String json_object) {

		VersioningModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new VersioningModel(jsobj.getInt("eventver"), jsobj.getString("startdate"), jsobj.getInt("tracks_ver"), jsobj.getString("end_date"), jsobj.getString("privacy"), jsobj.getString("timezone"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}