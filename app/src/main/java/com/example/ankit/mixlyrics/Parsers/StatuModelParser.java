import org.json.JSONException;
import org.json.JSONObject;

class StatuModelParser {

		ContentModelParser content_parser = new ContentModelParser();

		public StatuModelParser() {
		}

		public StatuModel parseStatuModel(String json_object) {

			StatuModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					local_model = new StatuModel(jsobj.getInt("duration") , jsobj.getString("value") , jsobj.getString("comment") , jsobj.getString("list") , jsobj.getString("reason") , content, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}