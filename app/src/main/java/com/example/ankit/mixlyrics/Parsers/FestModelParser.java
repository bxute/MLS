import org.json.JSONException;
import org.json.JSONObject;

class FestModelParser {


		public FestModelParser() {
		}

		public FestModel parseFestModel(String json_object) {

			FestModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new FestModel(jsobj.getString("uploadedby") , jsobj.getString("updatedon") , jsobj.getString("type") , jsobj.getString("uploadedon") , jsobj.getString("id") , jsobj.getBoolean("required") , jsobj.getString("description") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}