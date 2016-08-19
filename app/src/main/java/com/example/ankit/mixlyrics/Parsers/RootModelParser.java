import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		AccurseModelParser accurse_parser = new AccurseModelParser();
		WricModelParser wric_parser = new WricModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					AccurseModel accurse = accurse_parser.parseAccurseModel(jsobj.getJSONObject("accurse").toString());

					WricModel wric = wric_parser.parseWricModel(jsobj.getJSONObject("wric").toString());

					local_model = new RootModel(jsobj.getString("updatedon") , jsobj.getString("uploadedby") , jsobj.getString("naste") , accurse, jsobj.getString("uploadedon") , jsobj.getString("id") , jsobj.getString("updatededon") , wric, jsobj.getString("apiVersion") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}