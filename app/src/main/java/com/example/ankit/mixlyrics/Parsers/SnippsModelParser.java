import org.json.JSONException;
import org.json.JSONObject;

class SnippsModelParser {

		DesModelParser des_parser = new DesModelParser();

		public SnippsModelParser() {
		}

		public SnippsModel parseSnippsModel(String json_object) {

			SnippsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					local_model = new SnippsModel(jsobj.getString("type") , jsobj.getBoolean("required") , jsobj.getString("description") , des, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}