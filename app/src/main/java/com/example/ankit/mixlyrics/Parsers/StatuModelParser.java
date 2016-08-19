import org.json.JSONException;
import org.json.JSONObject;

class StatuModelParser {


		public StatuModelParser() {
		}

		public StatuModel parseStatuModel(String json_object) {

			StatuModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new StatuModel(jsobj.getInt("duration") , jsobj.getString("comment") , jsobj.getString("list") , jsobj.getString("reason") , jsobj.getString("value") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}