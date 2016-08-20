import org.json.JSONException;
import org.json.JSONObject;

class CompModelParser {


		public CompModelParser() {
		}

		public CompModel parseCompModel(String json_object) {

			CompModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new CompModel(jsobj.getBoolean("required") , jsobj.getString("5") , jsobj.getString("description") , jsobj.getString("6") , jsobj.getString("1") , jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}