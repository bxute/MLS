import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ReplModelParser {

		ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		AcceModelParser acce_parser = new AcceModelParser();

		public ReplModelParser() {
		}

		public ReplModel parseReplModel(String json_object) {

			ReplModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					AcceModel acce = acce_parser.parseAcceModel(jsobj.getJSONObject("acce").toString());

					local_model = new ReplModel(tagscontent, jsobj.getString("title") , player, jsobj.getString("uploadedon") , jsobj.getString("updatededon") , statu, jsobj.getString("description") , jsobj.getString("uploadedby") , jsobj.getString("id") , jsobj.getString("updatedon") , jsobj.getInt("commentCount") , thumbnail, acce, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}