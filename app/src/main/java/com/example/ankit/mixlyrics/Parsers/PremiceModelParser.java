import org.json.JSONException;
import org.json.JSONObject;

class PremiceModelParser {

		SnippsModelParser snipps_parser = new SnippsModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		DepthModelParser depth_parser = new DepthModelParser();
		TagerModelParser tager_parser = new TagerModelParser();

		public PremiceModelParser() {
		}

		public PremiceModel parsePremiceModel(String json_object) {

			PremiceModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					SnippsModel snipps = snipps_parser.parseSnippsModel(jsobj.getJSONObject("snipps").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					DepthModel depth = depth_parser.parseDepthModel(jsobj.getJSONObject("depth").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					local_model = new PremiceModel(snipps, pricem, depth, tager, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}