
class FullModel {

    public String background_image;
    public Call_for_papersModel _call_for_papers;
    public CopyrightModel _copyright;
    public String code_of_conduct;

    public FullModel(String background_image, Call_for_papersModel call_for_papers, CopyrightModel copyright, String code_of_conduct) {

        this.background_image = background_image;
        this._call_for_papers = call_for_papers;
        this._copyright = copyright;
        this.code_of_conduct = code_of_conduct;

    }

}