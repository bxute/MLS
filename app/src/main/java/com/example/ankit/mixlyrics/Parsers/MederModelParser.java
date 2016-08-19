import org.json.JSONException;
import org.json.JSONObject;

class MederModelParser {

		DesModelParser des_parser = new DesModelParser();
		TagerModelParser tager_parser = new TagerModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		FernsModelParser ferns_parser = new FernsModelParser();

		public MederModelParser() {
		}

		public MederModel parseMederModel(String json_object) {

			MederModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					FernsModel ferns = ferns_parser.parseFernsModel(jsobj.getJSONObject("ferns").toString());

					local_model = new MederModel(des, tager, pricem, ferns, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}