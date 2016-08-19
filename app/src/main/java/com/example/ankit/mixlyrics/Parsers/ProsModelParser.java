import org.json.JSONException;
import org.json.JSONObject;

class ProsModelParser {

		DesModelParser des_parser = new DesModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		TagerModelParser tager_parser = new TagerModelParser();
		FoltModelParser folt_parser = new FoltModelParser();

		public ProsModelParser() {
		}

		public ProsModel parseProsModel(String json_object) {

			ProsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					local_model = new ProsModel(des, pricem, tager, folt, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}