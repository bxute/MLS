import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ExsodeModelParser {

		AdeesModelParser adees_parser = new AdeesModelParser();
		ContestNoModelParser contestNo_parser = new ContestNoModelParser();
		ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		ThetaModelParser theta_parser = new ThetaModelParser();

		public ExsodeModelParser() {
		}

		public ExsodeModel parseExsodeModel(String json_object) {

			ExsodeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

					ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString());

					ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString());

					local_model = new ExsodeModel(jsobj.getString("updatedon") , tagsadees, jsobj.getString("uploadedon") , contestNo, jsobj.getString("uploadedby") , jsobj.getString("updatededon") , jsobj.getString("description") , arePIseeds, statu, jsobj.getString("title") , theta, jsobj.getString("id") , jsobj.getInt("commentCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}