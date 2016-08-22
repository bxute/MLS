import org.json.JSONException;
import org.json.JSONObject;

class FullModelParser {

    Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
    CopyrightModelParser copyright_parser = new CopyrightModelParser();

    public FullModelParser() {
    }

    public FullModel parseFullModel(String json_object) {

        FullModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

            CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

            local_model = new FullModel(jsobj.getString("background_image"), call_for_papers, copyright, jsobj.getString("code_of_conduct"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}