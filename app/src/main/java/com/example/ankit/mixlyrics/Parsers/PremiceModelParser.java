import org.json.JSONException;
import org.json.JSONObject;

class PremiceModelParser {

		TagerModelParser tager_parser = new TagerModelParser();
		DepthModelParser depth_parser = new DepthModelParser();
		SizerModelParser sizer_parser = new SizerModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();

		public PremiceModelParser() {
		}

		public PremiceModel parsePremiceModel(String json_object) {

			PremiceModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					DepthModel depth = depth_parser.parseDepthModel(jsobj.getJSONObject("depth").toString());

					SizerModel sizer = sizer_parser.parseSizerModel(jsobj.getJSONObject("sizer").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					local_model = new PremiceModel(tager, depth, sizer, pricem, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}