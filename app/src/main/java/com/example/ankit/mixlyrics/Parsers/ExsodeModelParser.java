import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ExsodeModelParser {

		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		AccesspiModelParser accesspi_parser = new AccesspiModelParser();
		StatuModelParser statu_parser = new StatuModelParser();

		public ExsodeModelParser() {
		}

		public ExsodeModel parseExsodeModel(String json_object) {

			ExsodeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					AccesspiModel accesspi = accesspi_parser.parseAccesspiModel(jsobj.getJSONObject("accesspi").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					local_model = new ExsodeModel(thumbnail, jsobj.getString("title") , jsobj.getString("id") , jsobj.getString("uploadedon") , content, jsobj.getInt("commentCount") , jsobj.getString("uploadedby") , jsobj.getString("updatededon") , player, jsobj.getString("description") , accesspi, tagsstatu, jsobj.getString("updatedon") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}