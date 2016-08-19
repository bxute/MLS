import org.json.JSONException;
import org.json.JSONObject;

class PropertiesModelParser {

		PricemModelParser pricem_parser = new PricemModelParser();
		TagerModelParser tager_parser = new TagerModelParser();
		DesModelParser des_parser = new DesModelParser();
		FoltModelParser folt_parser = new FoltModelParser();

		public PropertiesModelParser() {
		}

		public PropertiesModel parsePropertiesModel(String json_object) {

			PropertiesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					local_model = new PropertiesModel(pricem, tager, des, folt, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}