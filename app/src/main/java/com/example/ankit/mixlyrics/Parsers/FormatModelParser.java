import org.json.JSONException;
import org.json.JSONObject;

class FormatModelParser {

		DesModelParser des_parser = new DesModelParser();

		public FormatModelParser() {
		}

		public FormatModel parseFormatModel(String json_object) {

			FormatModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					local_model = new FormatModel(jsobj.getBoolean("required") , jsobj.getString("description") , des, jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}