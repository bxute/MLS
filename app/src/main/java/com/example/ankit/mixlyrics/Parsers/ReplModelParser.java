import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ReplModelParser {

		AcceModelParser acce_parser = new AcceModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();

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

					AcceModel acce = acce_parser.parseAcceModel(jsobj.getJSONObject("acce").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					local_model = new ReplModel(tagsjsobj.getString("uploadedby") , jsobj.getString("title") , jsobj.getString("updatededon") , jsobj.getString("description") , jsobj.getString("id") , acce, jsobj.getString("uploadedon") , jsobj.getInt("commentCount") , statu, content, jsobj.getString("updatedon") , player, thumbnail, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}