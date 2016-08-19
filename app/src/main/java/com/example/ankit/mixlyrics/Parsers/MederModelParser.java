import org.json.JSONException;
import org.json.JSONObject;

class MederModelParser {

		DesModelParser des_parser = new DesModelParser();
		FoltModelParser folt_parser = new FoltModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		TagerModelParser tager_parser = new TagerModelParser();

		public MederModelParser() {
		}

		public MederModel parseMederModel(String json_object) {

			MederModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					local_model = new MederModel(des, folt, pricem, tager, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}