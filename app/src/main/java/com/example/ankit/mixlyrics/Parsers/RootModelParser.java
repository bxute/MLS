import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		WrappersModelParser wrappers_parser = new WrappersModelParser();
		PremiceModelParser premice_parser = new PremiceModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					WrappersModel wrappers = wrappers_parser.parseWrappersModel(jsobj.getJSONObject("wrappers").toString());

					PremiceModel premice = premice_parser.parsePremiceModel(jsobj.getJSONObject("premice").toString());

					local_model = new RootModel(wrappers, jsobj.getString("apiVersion") , jsobj.getString("itemsType") , premice, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}