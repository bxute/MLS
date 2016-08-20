import org.json.JSONException;
import org.json.JSONObject;

class KriteModelParser {


		public KriteModelParser() {
		}

		public KriteModel parseKriteModel(String json_object) {

			KriteModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new KriteModel(jsobj.getString("5") , jsobj.getString("1") , jsobj.getString("6") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}