import org.json.JSONException;
import org.json.JSONObject;

class AcceModelParser {


		public AcceModelParser() {
		}

		public AcceModel parseAcceModel(String json_object) {

			AcceModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AcceModel(jsobj.getString("videoRespond") , jsobj.getString("comment") , jsobj.getString("syndicate") , jsobj.getString("list") , jsobj.getString("rate") , jsobj.getInt("ratingCount") , jsobj.getString("commentVote") , jsobj.getInt("viewCount") , jsobj.getString("embed") , jsobj.getString("aspectRatio") , jsobj.getInt("favoriteCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}