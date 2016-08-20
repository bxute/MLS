import org.json.JSONException;
import org.json.JSONObject;

class DepthModelParser {

		ContentModelParser content_parser = new ContentModelParser();

		public DepthModelParser() {
		}

		public DepthModel parseDepthModel(String json_object) {

			DepthModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					local_model = new DepthModel(jsobj.getBoolean("required") , jsobj.getString("description") , content, jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}