import org.json.JSONException;
import org.json.JSONObject;

class ExpressModelParser {

		ContestNoModelParser contestNo_parser = new ContestNoModelParser();
		ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();
		ThetaModelParser theta_parser = new ThetaModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		AdeesModelParser adees_parser = new AdeesModelParser();

		public ExpressModelParser() {
		}

		public ExpressModel parseExpressModel(String json_object) {

			ExpressModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString());

					ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

					ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

					local_model = new ExpressModel(contestNo, arePIseeds, jsobj.getString("id") , theta, jsobj.getInt("commentCount") , statu, adees, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}