import org.json.JSONException;
import org.json.JSONObject;

class SizerModelParser {

		DesModelParser des_parser = new DesModelParser();

		public SizerModelParser() {
		}

		public SizerModel parseSizerModel(String json_object) {

			SizerModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					local_model = new SizerModel(des, jsobj.getString("description") , jsobj.getBoolean("required") , jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}