import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ContainerModelParser {


		public ContainerModelParser() {
		}

		public ContainerModel parseContainerModel(String json_object) {

			ContainerModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					local_model = new ContainerModel(jsobj.getString("title") , jsobj.getString("uploadedon") , jsobj.getString("5") , jsobj.getString("1") , jsobj.getString("updatededon") , jsobj.getString("description") , jsobj.getString("updatedon") , jsobj.getString("uploadedby") , tagsjsobj.getString("6") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}