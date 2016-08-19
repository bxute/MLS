import org.json.JSONException;
import org.json.JSONObject;

class StatuModelParser {


		public StatuModelParser() {
		}

		public StatuModel parseStatuModel(String json_object) {

			StatuModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new StatuModel(jsobj.getString("reason") , jsobj.getInt("favoriteCount") , jsobj.getString("list") , jsobj.getString("comment") , jsobj.getString("value") , jsobj.getString("syndicate") , jsobj.getString("commentVote") , jsobj.getInt("viewCount") , jsobj.getString("aspectRatio") , jsobj.getInt("ratingCount") , jsobj.getString("rate") , jsobj.getInt("duration") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}