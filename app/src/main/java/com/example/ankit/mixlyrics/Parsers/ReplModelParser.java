import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ReplModelParser {

		AcceModelParser acce_parser = new AcceModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		StatuModelParser statu_parser = new StatuModelParser();

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

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					local_model = new ReplModel(tagsjsobj.getString("updatedon") , jsobj.getString("uploadedon") , jsobj.getString("updatededon") , jsobj.getString("description") , acce, player, jsobj.getString("uploadedby") , content, thumbnail, statu, jsobj.getString("id") , jsobj.getInt("commentCount") , jsobj.getString("title") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}