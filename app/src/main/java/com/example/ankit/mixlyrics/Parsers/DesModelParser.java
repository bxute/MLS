import org.json.JSONException;
import org.json.JSONObject;

class DesModelParser {

		CompModelParser comp_parser = new CompModelParser();

		public DesModelParser() {
		}

		public DesModel parseDesModel(String json_object) {

			DesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					CompModel comp = comp_parser.parseCompModel(jsobj.getJSONObject("comp").toString());

					local_model = new DesModel(jsobj.getBoolean("required") , jsobj.getString("type") , comp, jsobj.getString("description") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}