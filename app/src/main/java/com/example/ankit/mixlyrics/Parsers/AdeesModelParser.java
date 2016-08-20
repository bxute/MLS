import org.json.JSONException;
import org.json.JSONObject;

class AdeesModelParser {

		ContentModelParser content_parser = new ContentModelParser();

		public AdeesModelParser() {
		}

		public AdeesModel parseAdeesModel(String json_object) {

			AdeesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					local_model = new AdeesModel(jsobj.getString("value") , jsobj.getString("list") , jsobj.getString("aspectRatio") , jsobj.getString("reason") , jsobj.getInt("duration") , content, jsobj.getString("comment") , jsobj.getString("videoRespond") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}