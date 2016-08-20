import org.json.JSONException;
import org.json.JSONObject;

class ProductModelParser {

		PricemModelParser pricem_parser = new PricemModelParser();
		DepthModelParser depth_parser = new DepthModelParser();
		FormatModelParser format_parser = new FormatModelParser();
		TagerModelParser tager_parser = new TagerModelParser();

		public ProductModelParser() {
		}

		public ProductModel parseProductModel(String json_object) {

			ProductModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					DepthModel depth = depth_parser.parseDepthModel(jsobj.getJSONObject("depth").toString());

					FormatModel format = format_parser.parseFormatModel(jsobj.getJSONObject("format").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					local_model = new ProductModel(pricem, depth, format, tager, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}