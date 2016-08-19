import org.json.JSONException;
import org.json.JSONObject;

class DesModelParser {

		FestModelParser fest_parser = new FestModelParser();

		public DesModelParser() {
		}

		public DesModel parseDesModel(String json_object) {

			DesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					FestModel fest = fest_parser.parseFestModel(jsobj.getJSONObject("fest").toString());

					local_model = new DesModel(jsobj.getString("uploadedby") , jsobj.getString("updatedon") , jsobj.getString("type") , jsobj.getString("uploadedon") , jsobj.getString("id") , jsobj.getString("updatededon") , jsobj.getBoolean("required") , jsobj.getString("description") , fest, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}