import org.json.JSONException;
import org.json.JSONObject;

class ComplianceModelParser {


		public ComplianceModelParser() {
		}

		public ComplianceModel parseComplianceModel(String json_object) {

			ComplianceModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ComplianceModel(jsobj.getString("5") , jsobj.getString("1") , jsobj.getString("description") , jsobj.getString("6") , jsobj.getString("type") , jsobj.getBoolean("required") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}