import org.json.JSONException;
import org.json.JSONObject;

class ExpressModelParser {

		ThetaModelParser theta_parser = new ThetaModelParser();
		ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		ContestNoModelParser contestNo_parser = new ContestNoModelParser();
		AdeesModelParser adees_parser = new AdeesModelParser();

		public ExpressModelParser() {
		}

		public ExpressModel parseExpressModel(String json_object) {

			ExpressModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString());

					ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString());

					AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

					local_model = new ExpressModel(theta, jsobj.getString("id") , arePIseeds, jsobj.getInt("commentCount") , statu, contestNo, adees, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}