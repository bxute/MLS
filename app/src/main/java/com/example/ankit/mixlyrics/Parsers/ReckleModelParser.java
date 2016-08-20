import org.json.JSONException;
import org.json.JSONObject;

class ReckleModelParser {

		AdeesModelParser adees_parser = new AdeesModelParser();
		ThetaModelParser theta_parser = new ThetaModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		ContestNoModelParser contestNo_parser = new ContestNoModelParser();
		ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();

		public ReckleModelParser() {
		}

		public ReckleModel parseReckleModel(String json_object) {

			ReckleModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

					ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString());

					ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

					local_model = new ReckleModel(adees, theta, statu, contestNo, jsobj.getInt("commentCount") , jsobj.getString("_repe") , arePIseeds, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}