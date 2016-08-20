import org.json.JSONException;
import org.json.JSONObject;

class PremiceModelParser {

		TagerModelParser tager_parser = new TagerModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		SnippsModelParser snipps_parser = new SnippsModelParser();
		DepthModelParser depth_parser = new DepthModelParser();

		public PremiceModelParser() {
		}

		public PremiceModel parsePremiceModel(String json_object) {

			PremiceModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					SnippsModel snipps = snipps_parser.parseSnippsModel(jsobj.getJSONObject("snipps").toString());

					DepthModel depth = depth_parser.parseDepthModel(jsobj.getJSONObject("depth").toString());

					local_model = new PremiceModel(tager, pricem, snipps, depth, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}