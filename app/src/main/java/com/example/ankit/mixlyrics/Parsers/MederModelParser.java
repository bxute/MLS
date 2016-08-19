import org.json.JSONException;
import org.json.JSONObject;

class MederModelParser {

		TagerModelParser tager_parser = new TagerModelParser();
		FoltModelParser folt_parser = new FoltModelParser();
		DesModelParser des_parser = new DesModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();

		public MederModelParser() {
		}

		public MederModel parseMederModel(String json_object) {

			MederModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					local_model = new MederModel(tager, folt, des, pricem, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}