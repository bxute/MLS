import org.json.JSONException;
import org.json.JSONObject;

class MineModelParser {

		PricemModelParser pricem_parser = new PricemModelParser();
		TagerModelParser tager_parser = new TagerModelParser();
		FernsModelParser ferns_parser = new FernsModelParser();
		DesModelParser des_parser = new DesModelParser();

		public MineModelParser() {
		}

		public MineModel parseMineModel(String json_object) {

			MineModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					FernsModel ferns = ferns_parser.parseFernsModel(jsobj.getJSONObject("ferns").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					local_model = new MineModel(pricem, tager, ferns, des, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}