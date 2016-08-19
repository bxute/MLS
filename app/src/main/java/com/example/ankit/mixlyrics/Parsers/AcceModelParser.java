import org.json.JSONException;
import org.json.JSONObject;

class AcceModelParser {


		public AcceModelParser() {
		}

		public AcceModel parseAcceModel(String json_object) {

			AcceModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AcceModel(jsobj.getInt("favoriteCount") , jsobj.getString("comment") , jsobj.getString("syndicate") , jsobj.getString("commentVote") , jsobj.getString("list") , jsobj.getInt("ratingCount") , jsobj.getString("aspectRatio") , jsobj.getString("embed") , jsobj.getString("videoRespond") , jsobj.getString("rate") , jsobj.getInt("viewCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}