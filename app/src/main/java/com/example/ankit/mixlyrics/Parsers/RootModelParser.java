import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		ProductModelParser product_parser = new ProductModelParser();
		WrppersModelParser wrppers_parser = new WrppersModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ProductModel product = product_parser.parseProductModel(jsobj.getJSONObject("product").toString());

					WrppersModel wrppers = wrppers_parser.parseWrppersModel(jsobj.getJSONObject("wrppers").toString());

					local_model = new RootModel(jsobj.getString("apiVersion") , product, jsobj.getString("name") , wrppers, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}