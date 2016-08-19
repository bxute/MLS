import org.json.JSONException;
import org.json.JSONObject;

class StatuModelParser {


		public StatuModelParser() {
		}

		public StatuModel parseStatuModel(String json_object) {

			StatuModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new StatuModel(jsobj.getInt("duration") , jsobj.getString("list") , jsobj.getInt("viewCount") , jsobj.getString("aspectRatio") , jsobj.getInt("favoriteCount") , jsobj.getString("commentVote") , jsobj.getString("syndicate") , jsobj.getInt("ratingCount") , jsobj.getString("value") , jsobj.getString("rate") , jsobj.getString("reason") , jsobj.getString("comment") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}