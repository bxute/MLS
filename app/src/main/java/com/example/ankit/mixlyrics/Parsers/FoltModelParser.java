import org.json.JSONException;
import org.json.JSONObject;

class FoltModelParser {

		DesModelParser des_parser = new DesModelParser();

		public FoltModelParser() {
		}

		public FoltModel parseFoltModel(String json_object) {

			FoltModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					local_model = new FoltModel(jsobj.getBoolean("required") , jsobj.getString("type") , jsobj.getString("description") , des, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}