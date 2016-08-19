import org.json.JSONException;
import org.json.JSONObject;

class AcceModelParser {


		public AcceModelParser() {
		}

		public AcceModel parseAcceModel(String json_object) {

			AcceModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AcceModel(jsobj.getString("list") , jsobj.getInt("viewCount") , jsobj.getString("rate") , jsobj.getInt("favoriteCount") , jsobj.getString("commentVote") , jsobj.getString("comment") , jsobj.getString("aspectRatio") , jsobj.getInt("ratingCount") , jsobj.getString("videoRespond") , jsobj.getString("embed") , jsobj.getString("syndicate") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}