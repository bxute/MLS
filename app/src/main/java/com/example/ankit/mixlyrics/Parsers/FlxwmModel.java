
class FlxwmModel {

	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public CopModel _cop;
	public String background_image;

	public FlxwmModel(String code_of_conduct, Call_for_papersModel call_for_papers, CopModel cop, String background_image) {

		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this._cop = cop;
		this.background_image = background_image;

	}

}