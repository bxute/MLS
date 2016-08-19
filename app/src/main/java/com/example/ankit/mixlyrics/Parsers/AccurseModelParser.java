import org.json.JSONException;
import org.json.JSONObject;

class AccurseModelParser {

		PricemeModelParser priceme_parser = new PricemeModelParser();
		TagerModelParser tager_parser = new TagerModelParser();
		FestModelParser fest_parser = new FestModelParser();
		DesModelParser des_parser = new DesModelParser();

		public AccurseModelParser() {
		}

		public AccurseModel parseAccurseModel(String json_object) {

			AccurseModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PricemeModel priceme = priceme_parser.parsePricemeModel(jsobj.getJSONObject("priceme").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					FestModel fest = fest_parser.parseFestModel(jsobj.getJSONObject("fest").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					local_model = new AccurseModel(priceme, tager, fest, des, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}