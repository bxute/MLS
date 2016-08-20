import org.json.JSONException;
import org.json.JSONObject;

class StatuModelParser {

		ContainerModelParser container_parser = new ContainerModelParser();

		public StatuModelParser() {
		}

		public StatuModel parseStatuModel(String json_object) {

			StatuModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContainerModel container = container_parser.parseContainerModel(jsobj.getJSONObject("container").toString());

					local_model = new StatuModel(jsobj.getString("list") , jsobj.getString("comment") , jsobj.getString("reason") , jsobj.getInt("modelist") , jsobj.getString("value") , container, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}