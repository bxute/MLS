import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		WricModelParser wric_parser = new WricModelParser();
		MederModelParser meder_parser = new MederModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					WricModel wric = wric_parser.parseWricModel(jsobj.getJSONObject("wric").toString());

					MederModel meder = meder_parser.parseMederModel(jsobj.getJSONObject("meder").toString());

					local_model = new RootModel(jsobj.getString("apiVersion") , jsobj.getString("name") , wric, meder, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}