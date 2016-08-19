import org.json.JSONException;
import org.json.JSONObject;

class AccurseModelParser {

		DesModelParser des_parser = new DesModelParser();
		TagerModelParser tager_parser = new TagerModelParser();
		FestModelParser fest_parser = new FestModelParser();
		PricemeModelParser priceme_parser = new PricemeModelParser();

		public AccurseModelParser() {
		}

		public AccurseModel parseAccurseModel(String json_object) {

			AccurseModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					FestModel fest = fest_parser.parseFestModel(jsobj.getJSONObject("fest").toString());

					PricemeModel priceme = priceme_parser.parsePricemeModel(jsobj.getJSONObject("priceme").toString());

					local_model = new AccurseModel(des, tager, fest, priceme, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}