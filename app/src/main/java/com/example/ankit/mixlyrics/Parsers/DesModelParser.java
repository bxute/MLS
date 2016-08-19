import org.json.JSONException;
import org.json.JSONObject;

class DesModelParser {


		public DesModelParser() {
		}

		public DesModel parseDesModel(String json_object) {

			DesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new DesModel(jsobj.getInt("favoriteCount") , jsobj.getString("commentVote") , jsobj.getString("syndicate") , jsobj.getInt("ratingCount") , jsobj.getBoolean("required") , jsobj.getString("list") , jsobj.getString("description") , jsobj.getInt("viewCount") , jsobj.getString("rate") , jsobj.getString("comment") , jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}