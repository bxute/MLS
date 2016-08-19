import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ExsodeModelParser {

		PlayerModelParser player_parser = new PlayerModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		AccesspiModelParser accesspi_parser = new AccesspiModelParser();

		public ExsodeModelParser() {
		}

		public ExsodeModel parseExsodeModel(String json_object) {

			ExsodeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					AccesspiModel accesspi = accesspi_parser.parseAccesspiModel(jsobj.getJSONObject("accesspi").toString());

					local_model = new ExsodeModel(jsobj.getString("updatededon") , jsobj.getString("updatedon") , jsobj.getString("id") , jsobj.getString("description") , tagsjsobj.getString("title") , player, jsobj.getString("uploadedby") , jsobj.getString("uploadedon") , jsobj.getInt("commentCount") , content, statu, thumbnail, accesspi, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}