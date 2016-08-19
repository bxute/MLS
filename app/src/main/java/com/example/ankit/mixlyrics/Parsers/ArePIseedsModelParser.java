import org.json.JSONException;
import org.json.JSONObject;

class ArePIseedsModelParser {

		ContentModelParser content_parser = new ContentModelParser();

		public ArePIseedsModelParser() {
		}

		public ArePIseedsModel parseArePIseedsModel(String json_object) {

			ArePIseedsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					local_model = new ArePIseedsModel(jsobj.getString("value") , jsobj.getString("comment") , jsobj.getString("aspectRatio") , jsobj.getString("videoRespond") , jsobj.getInt("duration") , jsobj.getString("reason") , content, jsobj.getString("list") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}