import org.json.JSONException;
import org.json.JSONObject;

class MederModelParser {

		TagerModelParser tager_parser = new TagerModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		DesModelParser des_parser = new DesModelParser();
		FoltModelParser folt_parser = new FoltModelParser();

		public MederModelParser() {
		}

		public MederModel parseMederModel(String json_object) {

			MederModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					local_model = new MederModel(tager, pricem, des, folt, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}