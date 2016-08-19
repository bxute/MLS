import org.json.JSONException;
import org.json.JSONObject;

class PropertiesModelParser {

		FoltModelParser folt_parser = new FoltModelParser();
		DesModelParser des_parser = new DesModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		TagerModelParser tager_parser = new TagerModelParser();

		public PropertiesModelParser() {
		}

		public PropertiesModel parsePropertiesModel(String json_object) {

			PropertiesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					local_model = new PropertiesModel(folt, des, pricem, tager, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}