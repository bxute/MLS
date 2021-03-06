import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RemedeModelParser {

		PlayerModelParser player_parser = new PlayerModelParser();
		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		AcceModelParser acce_parser = new AcceModelParser();

		public RemedeModelParser() {
		}

		public RemedeModel parseRemedeModel(String json_object) {

			RemedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					AcceModel acce = acce_parser.parseAcceModel(jsobj.getJSONObject("acce").toString());

					local_model = new RemedeModel(jsobj.getString("description") , player, thumbnail, jsobj.getString("updatededon") , jsobj.getString("title") , tagsjsobj.getString("uploadedby") , content, jsobj.getInt("commentCount") , statu, jsobj.getString("uploadedon") , acce, jsobj.getString("id") , jsobj.getString("updatedon") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}