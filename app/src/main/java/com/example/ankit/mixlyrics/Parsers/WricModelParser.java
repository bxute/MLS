import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class WricModelParser {

		ReplModelParser repl_parser;

		public WricModelParser() {
			repl_parser = new ReplModelParser();
		}

		public WricModel parseWricModel(String json_object) {

			WricModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<ReplModel> repls = new ArrayList<>();
					JSONArray repl_arr = jsobj.getJSONArray("repl");
			
					for(int i = 0 ;i<repl_arr.length();i++){

 						repls.add(repl_parser.parseReplModel((String)repl_arr.get(i)));

					}

					local_model = new WricModel(repls, jsobj.getInt("itemsPerPage") , jsobj.getString("updated") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}