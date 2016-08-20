import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		WrppersModelParser wrppers_parser = new WrppersModelParser();
		MineModelParser mine_parser = new MineModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					WrppersModel wrppers = wrppers_parser.parseWrppersModel(jsobj.getJSONObject("wrppers").toString());

					MineModel mine = mine_parser.parseMineModel(jsobj.getJSONObject("mine").toString());

					local_model = new RootModel(jsobj.getString("apiVersion") , wrppers, mine, jsobj.getString("name") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}