import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		MineModelParser mine_parser = new MineModelParser();
		WrppersModelParser wrppers_parser = new WrppersModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					MineModel mine = mine_parser.parseMineModel(jsobj.getJSONObject("mine").toString());

					WrppersModel wrppers = wrppers_parser.parseWrppersModel(jsobj.getJSONObject("wrppers").toString());

					local_model = new RootModel(jsobj.getString("name") , jsobj.getString("apiVersion") , mine, wrppers, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}