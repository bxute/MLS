import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ExpressModelParser {

		ContestNoModelParser contestNo_parser = new ContestNoModelParser();
		ThetaModelParser theta_parser = new ThetaModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();
		AdeesModelParser adees_parser = new AdeesModelParser();

		public ExpressModelParser() {
		}

		public ExpressModel parseExpressModel(String json_object) {

			ExpressModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString());

					ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

					AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

					local_model = new ExpressModel(contestNo, theta, jsobj.getInt("commentCount") , jsobj.getString("uploadedon") , jsobj.getString("description") , tagsstatu, arePIseeds, jsobj.getString("uploadedby") , jsobj.getString("updatededon") , adees, jsobj.getString("id") , jsobj.getString("title") , jsobj.getString("updatedon") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}