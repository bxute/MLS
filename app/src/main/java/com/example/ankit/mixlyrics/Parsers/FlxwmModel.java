
class FlxwmModel {

	public CopModel _cop;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String background_image;

	public FlxwmModel(CopModel cop, Call_for_papersModel call_for_papers, String code_of_conduct, String background_image) {

		this._cop = cop;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;

	}

}