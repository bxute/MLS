import org.json.JSONException;
import org.json.JSONObject;

class ContainerModelParser {


		public ContainerModelParser() {
		}

		public ContainerModel parseContainerModel(String json_object) {

			ContainerModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ContainerModel(jsobj.getString("6") , jsobj.getString("5") , jsobj.getString("1") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}