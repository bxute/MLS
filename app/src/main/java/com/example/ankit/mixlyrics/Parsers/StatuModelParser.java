import org.json.JSONException;
import org.json.JSONObject;

class StatuModelParser {


		public StatuModelParser() {
		}

		public StatuModel parseStatuModel(String json_object) {

			StatuModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new StatuModel(jsobj.getString("comment") , jsobj.getString("aspectRatio") , jsobj.getInt("duration") , jsobj.getString("syndicate") , jsobj.getString("list") , jsobj.getString("rate") , jsobj.getString("reason") , jsobj.getString("commentVote") , jsobj.getString("value") , jsobj.getInt("ratingCount") , jsobj.getInt("viewCount") , jsobj.getInt("favoriteCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}