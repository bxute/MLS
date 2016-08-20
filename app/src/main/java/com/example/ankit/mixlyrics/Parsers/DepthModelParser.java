import org.json.JSONException;
import org.json.JSONObject;

class DepthModelParser {

		CroopersModelParser croopers_parser = new CroopersModelParser();

		public DepthModelParser() {
		}

		public DepthModel parseDepthModel(String json_object) {

			DepthModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					CroopersModel croopers = croopers_parser.parseCroopersModel(jsobj.getJSONObject("croopers").toString());

					local_model = new DepthModel(jsobj.getString("type") , jsobj.getString("description") , jsobj.getBoolean("required") , croopers, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}