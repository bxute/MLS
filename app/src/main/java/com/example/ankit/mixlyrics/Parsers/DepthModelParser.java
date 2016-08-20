import org.json.JSONException;
import org.json.JSONObject;

class DepthModelParser {

		KriteModelParser krite_parser = new KriteModelParser();

		public DepthModelParser() {
		}

		public DepthModel parseDepthModel(String json_object) {

			DepthModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					KriteModel krite = krite_parser.parseKriteModel(jsobj.getJSONObject("krite").toString());

					local_model = new DepthModel(krite, jsobj.getString("description") , jsobj.getBoolean("required") , jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}