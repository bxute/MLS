import org.json.JSONException;
import org.json.JSONObject;

class ContestNoModelParser {


		public ContestNoModelParser() {
		}

		public ContestNoModel parseContestNoModel(String json_object) {

			ContestNoModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ContestNoModel(jsobj.getString("1") , jsobj.getString("6") , jsobj.getString("5") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}