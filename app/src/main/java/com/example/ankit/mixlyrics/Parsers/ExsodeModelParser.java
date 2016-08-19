import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ExsodeModelParser {

		ThetaModelParser theta_parser = new ThetaModelParser();
		ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();
		ContestNoModelParser contestNo_parser = new ContestNoModelParser();
		StatuModelParser statu_parser = new StatuModelParser();

		public ExsodeModelParser() {
		}

		public ExsodeModel parseExsodeModel(String json_object) {

			ExsodeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString());

					ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

					ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					local_model = new ExsodeModel(jsobj.getString("uploadedby") , theta, jsobj.getInt("commentCount") , jsobj.getString("description") , arePIseeds, contestNo, jsobj.getString("title") , jsobj.getString("id") , jsobj.getString("updatedon") , jsobj.getString("updatededon") , statu, jsobj.getString("uploadedon") , tags);
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}