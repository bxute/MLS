import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ExsodeModelParser {

		StatuModelParser statu_parser = new StatuModelParser();
		ContestNoModelParser contestNo_parser = new ContestNoModelParser();
		AdeesModelParser adees_parser = new AdeesModelParser();
		ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();
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

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString());

					AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

					ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

					ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString());

					local_model = new ExsodeModel(jsobj.getString("id") , tagsjsobj.getString("title") , jsobj.getString("updatedon") , jsobj.getString("uploadedby") , jsobj.getInt("commentCount") , jsobj.getString("uploadedon") , statu, contestNo, adees, jsobj.getString("description") , arePIseeds, jsobj.getString("updatededon") , theta, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}