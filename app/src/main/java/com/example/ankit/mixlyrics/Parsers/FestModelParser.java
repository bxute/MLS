import org.json.JSONException;
import org.json.JSONObject;

class FestModelParser {


		public FestModelParser() {
		}

		public FestModel parseFestModel(String json_object) {

			FestModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new FestModel(jsobj.getString("description") , jsobj.getString("uploadedby") , jsobj.getString("id") , jsobj.getString("uploadedon") , jsobj.getString("type") , jsobj.getString("updatedon") , jsobj.getBoolean("required") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}