import org.json.JSONException;
import org.json.JSONObject;

class StatuModelParser {


		public StatuModelParser() {
		}

		public StatuModel parseStatuModel(String json_object) {

			StatuModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new StatuModel(jsobj.getString("list") , jsobj.getString("rate") , jsobj.getInt("duration") , jsobj.getInt("favoriteCount") , jsobj.getString("syndicate") , jsobj.getInt("viewCount") , jsobj.getString("reason") , jsobj.getString("aspectRatio") , jsobj.getInt("ratingCount") , jsobj.getString("commentVote") , jsobj.getString("comment") , jsobj.getString("value") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}