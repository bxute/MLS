import org.json.JSONException;
import org.json.JSONObject;

class DesModelParser {


		public DesModelParser() {
		}

		public DesModel parseDesModel(String json_object) {

			DesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new DesModel(jsobj.getString("type") , jsobj.getString("uploadedby") , jsobj.getString("id") , jsobj.getString("updatededon") , jsobj.getString("description") , jsobj.getString("updatedon") , jsobj.getBoolean("required") , jsobj.getString("uploadedon") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}