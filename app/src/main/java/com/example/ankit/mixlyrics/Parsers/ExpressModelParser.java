import org.json.JSONException;
import org.json.JSONObject;

class ExpressModelParser {

		AdeesModelParser adees_parser = new AdeesModelParser();
		ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();
		ContestNoModelParser contestNo_parser = new ContestNoModelParser();
		ThetaModelParser theta_parser = new ThetaModelParser();
		StatuModelParser statu_parser = new StatuModelParser();

		public ExpressModelParser() {
		}

		public ExpressModel parseExpressModel(String json_object) {

			ExpressModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

					ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

					ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString());

					ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					local_model = new ExpressModel(adees, jsobj.getInt("commentCount") , arePIseeds, jsobj.getString("id") , contestNo, theta, statu, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}