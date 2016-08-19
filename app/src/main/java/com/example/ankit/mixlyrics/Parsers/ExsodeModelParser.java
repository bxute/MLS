import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ExsodeModelParser {

		ThetaModelParser theta_parser = new ThetaModelParser();
		ContestNoModelParser contestNo_parser = new ContestNoModelParser();
		ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();
		StatuModelParser statu_parser = new StatuModelParser();

		public ExsodeModelParser() {
		}

		public ExsodeModel parseExsodeModel(String json_object) {

			ExsodeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString());

					ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					local_model = new ExsodeModel(jsobj.getString("title") , jsobj.getString("updatedon") , theta, jsobj.getString("uploadedon") , jsobj.getString("id") , contestNo, tagsarePIseeds, jsobj.getString("updatededon") , jsobj.getString("description") , jsobj.getString("uploadedby") , jsobj.getInt("commentCount") , statu, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}