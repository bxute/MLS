import org.json.JSONException;
import org.json.JSONObject;

class FlackModelParser {

    Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
    CopyrightModelParser copyright_parser = new CopyrightModelParser();

    public FlackModelParser() {
    }

    public FlackModel parseFlackModel(String json_object) {

        FlackModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

            CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

            local_model = new FlackModel(call_for_papers, jsobj.getString("background_image"), jsobj.getString("code_of_conduct"), copyright, );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}