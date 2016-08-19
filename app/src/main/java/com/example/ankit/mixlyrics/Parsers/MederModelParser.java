import org.json.JSONException;
import org.json.JSONObject;

class MederModelParser {

		PricemModelParser pricem_parser = new PricemModelParser();
		FoltModelParser folt_parser = new FoltModelParser();
		DesModelParser des_parser = new DesModelParser();
		TagerModelParser tager_parser = new TagerModelParser();

		public MederModelParser() {
		}

		public MederModel parseMederModel(String json_object) {

			MederModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					local_model = new MederModel(pricem, folt, des, tager, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}