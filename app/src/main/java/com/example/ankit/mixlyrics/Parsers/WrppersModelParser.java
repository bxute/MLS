import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class WrppersModelParser {

		ExpressModelParser express_parser;

		public WrppersModelParser() {
			express_parser = new ExpressModelParser();
		}

		public WrppersModel parseWrppersModel(String json_object) {

			WrppersModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<ExpressModel> expresss = new ArrayList<>();
					JSONArray express_arr = jsobj.getJSONArray("express");
			
					for(int i = 0 ;i<express_arr.length();i++){

 						expresss.add(express_parser.parseExpressModel((String)express_arr.get(i)));

					}

					local_model = new WrppersModel(jsobj.getString("updated") , jsobj.getInt("itemsPerPage") , expresss, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}