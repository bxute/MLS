import org.json.JSONException;
import org.json.JSONObject;

class PropertiesModelParser {

		TagerModelParser tager_parser = new TagerModelParser();
		DesModelParser des_parser = new DesModelParser();
		FoltModelParser folt_parser = new FoltModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();

		public PropertiesModelParser() {
		}

		public PropertiesModel parsePropertiesModel(String json_object) {

			PropertiesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					local_model = new PropertiesModel(tager, des, folt, pricem, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}