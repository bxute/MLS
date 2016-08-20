import org.json.JSONException;
import org.json.JSONObject;

class ReckleModelParser {

		AdeesModelParser adees_parser = new AdeesModelParser();
		ContestNoModelParser contestNo_parser = new ContestNoModelParser();
		ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();
		ThetaModelParser theta_parser = new ThetaModelParser();
		SedModelParser sed_parser = new SedModelParser();

		public ReckleModelParser() {
		}

		public ReckleModel parseReckleModel(String json_object) {

			ReckleModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

					ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString());

					ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

					ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString());

					SedModel sed = sed_parser.parseSedModel(jsobj.getJSONObject("sed").toString());

					local_model = new ReckleModel(jsobj.getString("_repe") , adees, contestNo, arePIseeds, theta, sed, jsobj.getInt("commentCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}