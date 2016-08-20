import org.json.JSONException;
import org.json.JSONObject;

class DesModelParser {

		ContentModelParser content_parser = new ContentModelParser();

		public DesModelParser() {
		}

		public DesModel parseDesModel(String json_object) {

			DesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					local_model = new DesModel(jsobj.getString("type") , content, jsobj.getBoolean("required") , jsobj.getString("description") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}