import org.json.JSONException;
import org.json.JSONObject;

class FernsModelParser {

		DesModelParser des_parser = new DesModelParser();

		public FernsModelParser() {
		}

		public FernsModel parseFernsModel(String json_object) {

			FernsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					local_model = new FernsModel(jsobj.getBoolean("required") , jsobj.getString("type") , jsobj.getString("description") , des, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}