import org.json.JSONException;
import org.json.JSONObject;

class PremiceModelParser {

		DepthModelParser depth_parser = new DepthModelParser();
		SnippsModelParser snipps_parser = new SnippsModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		TagerModelParser tager_parser = new TagerModelParser();

		public PremiceModelParser() {
		}

		public PremiceModel parsePremiceModel(String json_object) {

			PremiceModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DepthModel depth = depth_parser.parseDepthModel(jsobj.getJSONObject("depth").toString());

					SnippsModel snipps = snipps_parser.parseSnippsModel(jsobj.getJSONObject("snipps").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					local_model = new PremiceModel(depth, snipps, pricem, tager, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}