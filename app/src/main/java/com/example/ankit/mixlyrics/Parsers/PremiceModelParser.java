import org.json.JSONException;
import org.json.JSONObject;

class PremiceModelParser {

		TagerModelParser tager_parser = new TagerModelParser();
		DepthModelParser depth_parser = new DepthModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		SnippsModelParser snipps_parser = new SnippsModelParser();

		public PremiceModelParser() {
		}

		public PremiceModel parsePremiceModel(String json_object) {

			PremiceModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					DepthModel depth = depth_parser.parseDepthModel(jsobj.getJSONObject("depth").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					SnippsModel snipps = snipps_parser.parseSnippsModel(jsobj.getJSONObject("snipps").toString());

					local_model = new PremiceModel(tager, depth, pricem, snipps, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}