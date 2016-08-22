import org.json.JSONException;
import org.json.JSONObject;

class CopyrightModelParser {

	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();

	public CopyrightModelParser() {
	}

	public CopyrightModel parseCopyrightModel(String json_object) {

		CopyrightModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

			local_model = new CopyrightModel(jsobj.getString("licence"), jsobj.getInt("year"), jsobj.getString("holder_url"), jsobj.getString("end_time"), call_for_papers, jsobj.getString("email"), jsobj.getInt("id"), jsobj.getString("logo"), jsobj.getString("licence_url"), jsobj.getString("holder"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
		}
			
}