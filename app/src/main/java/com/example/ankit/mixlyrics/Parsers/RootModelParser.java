import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		PremiceModelParser premice_parser = new PremiceModelParser();
		WrppersModelParser wrppers_parser = new WrppersModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PremiceModel premice = premice_parser.parsePremiceModel(jsobj.getJSONObject("premice").toString());

					WrppersModel wrppers = wrppers_parser.parseWrppersModel(jsobj.getJSONObject("wrppers").toString());

					local_model = new RootModel(jsobj.getString("apiVersion") , jsobj.getString("itemsType") , premice, wrppers, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}