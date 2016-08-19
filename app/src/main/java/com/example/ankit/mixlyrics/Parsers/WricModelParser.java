import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class WricModelParser {

		RemedeModelParser remede_parser;

		public WricModelParser() {
			remede_parser = new RemedeModelParser();
		}

		public WricModel parseWricModel(String json_object) {

			WricModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<RemedeModel> remedes = new ArrayList<>();
					JSONArray remede_arr = jsobj.getJSONArray("remede");
			
					for(int i = 0 ;i<remede_arr.length();i++){

 						remedes.add(remede_parser.parseRemedeModel((String)remede_arr.get(i)));

					}

					local_model = new WricModel(jsobj.getInt("itemsPerPage") , jsobj.getString("updated") , remedes, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}