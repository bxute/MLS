import org.json.JSONException;
import org.json.JSONObject;

class AccesspiModelParser {


		public AccesspiModelParser() {
		}

		public AccesspiModel parseAccesspiModel(String json_object) {

			AccesspiModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AccesspiModel(jsobj.getString("list") , jsobj.getInt("favoriteCount") , jsobj.getString("videoRespond") , jsobj.getInt("ratingCount") , jsobj.getString("rate") , jsobj.getString("aspectRatio") , jsobj.getString("commentVote") , jsobj.getString("syndicate") , jsobj.getString("comment") , jsobj.getInt("viewCount") , jsobj.getString("embed") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}