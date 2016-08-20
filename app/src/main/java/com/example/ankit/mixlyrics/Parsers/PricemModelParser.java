import org.json.JSONException;
import org.json.JSONObject;

class PricemModelParser {


		public PricemModelParser() {
		}

		public PricemModel parsePricemModel(String json_object) {

			PricemModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new PricemModel(jsobj.getString("type") , jsobj.getBoolean("required") , jsobj.getInt("minimum") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}