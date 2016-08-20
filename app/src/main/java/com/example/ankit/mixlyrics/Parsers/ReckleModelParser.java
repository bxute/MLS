import org.json.JSONException;
import org.json.JSONObject;

class ReckleModelParser {

		ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		AdeesModelParser adees_parser = new AdeesModelParser();
		ThetaModelParser theta_parser = new ThetaModelParser();
		ContestNoModelParser contestNo_parser = new ContestNoModelParser();

		public ReckleModelParser() {
		}

		public ReckleModel parseReckleModel(String json_object) {

			ReckleModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

					ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString());

					ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString());

					local_model = new ReckleModel(arePIseeds, jsobj.getString("id") , statu, jsobj.getInt("commentCount") , adees, theta, contestNo, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}