import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		WrppersModelParser wrppers_parser = new WrppersModelParser();
		PremiceModelParser premice_parser = new PremiceModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					WrppersModel wrppers = wrppers_parser.parseWrppersModel(jsobj.getJSONObject("wrppers").toString());

					PremiceModel premice = premice_parser.parsePremiceModel(jsobj.getJSONObject("premice").toString());

					local_model = new RootModel(jsobj.getString("name") , wrppers, premice, jsobj.getString("apiVersion") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}