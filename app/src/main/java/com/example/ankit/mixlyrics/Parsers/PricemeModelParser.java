import org.json.JSONException;
import org.json.JSONObject;

class PricemeModelParser {


		public PricemeModelParser() {
		}

		public PricemeModel parsePricemeModel(String json_object) {

			PricemeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new PricemeModel(jsobj.getInt("minimum") , jsobj.getBoolean("required") , jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}