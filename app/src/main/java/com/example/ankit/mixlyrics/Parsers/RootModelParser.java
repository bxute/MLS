import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		MederModelParser meder_parser = new MederModelParser();
		WricModelParser wric_parser = new WricModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					MederModel meder = meder_parser.parseMederModel(jsobj.getJSONObject("meder").toString());

					WricModel wric = wric_parser.parseWricModel(jsobj.getJSONObject("wric").toString());

					local_model = new RootModel(meder, jsobj.getString("name") , jsobj.getString("apiVersion") , wric, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}