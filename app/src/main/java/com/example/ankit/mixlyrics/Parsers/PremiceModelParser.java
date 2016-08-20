import org.json.JSONException;
import org.json.JSONObject;

class PremiceModelParser {

		DepthModelParser depth_parser = new DepthModelParser();
		TagerModelParser tager_parser = new TagerModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		SnippsModelParser snipps_parser = new SnippsModelParser();

		public PremiceModelParser() {
		}

		public PremiceModel parsePremiceModel(String json_object) {

			PremiceModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DepthModel depth = depth_parser.parseDepthModel(jsobj.getJSONObject("depth").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					SnippsModel snipps = snipps_parser.parseSnippsModel(jsobj.getJSONObject("snipps").toString());

					local_model = new PremiceModel(depth, tager, pricem, snipps, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}