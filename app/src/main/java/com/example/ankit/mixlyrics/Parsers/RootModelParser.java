import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		ProsModelParser pros_parser = new ProsModelParser();
		WricModelParser wric_parser = new WricModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ProsModel pros = pros_parser.parseProsModel(jsobj.getJSONObject("pros").toString());

					WricModel wric = wric_parser.parseWricModel(jsobj.getJSONObject("wric").toString());

					local_model = new RootModel(jsobj.getString("updatedon") , jsobj.getString("uploadedby") , jsobj.getString("naste") , jsobj.getString("apiVersion") , pros, jsobj.getString("updatededon") , wric, jsobj.getString("id") , jsobj.getString("uploadedon") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}