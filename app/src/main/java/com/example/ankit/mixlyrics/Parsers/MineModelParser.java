import org.json.JSONException;
import org.json.JSONObject;

class MineModelParser {

		TagerModelParser tager_parser = new TagerModelParser();
		FernsModelParser ferns_parser = new FernsModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		DesModelParser des_parser = new DesModelParser();

		public MineModelParser() {
		}

		public MineModel parseMineModel(String json_object) {

			MineModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					FernsModel ferns = ferns_parser.parseFernsModel(jsobj.getJSONObject("ferns").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					local_model = new MineModel(tager, ferns, pricem, des, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}