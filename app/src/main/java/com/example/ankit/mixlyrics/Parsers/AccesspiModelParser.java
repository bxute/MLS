import org.json.JSONException;
import org.json.JSONObject;

class AccesspiModelParser {

		ContentModelParser content_parser = new ContentModelParser();

		public AccesspiModelParser() {
		}

		public AccesspiModel parseAccesspiModel(String json_object) {

			AccesspiModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					local_model = new AccesspiModel(jsobj.getString("aspectRatio") , jsobj.getString("videoRespond") , jsobj.getInt("duration") , jsobj.getString("value") , jsobj.getString("comment") , jsobj.getString("list") , jsobj.getString("reason") , content, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}