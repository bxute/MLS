import org.json.JSONException;
import org.json.JSONObject;

class AccesspiModelParser {


		public AccesspiModelParser() {
		}

		public AccesspiModel parseAccesspiModel(String json_object) {

			AccesspiModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AccesspiModel(jsobj.getInt("ratingCount") , jsobj.getString("aspectRatio") , jsobj.getString("syndicate") , jsobj.getString("embed") , jsobj.getString("comment") , jsobj.getString("commentVote") , jsobj.getInt("viewCount") , jsobj.getString("list") , jsobj.getString("rate") , jsobj.getInt("favoriteCount") , jsobj.getString("videoRespond") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}