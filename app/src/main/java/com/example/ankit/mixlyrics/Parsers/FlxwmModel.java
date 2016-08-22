
class FlxwmModel {

	public String code_of_conduct;
	public String background_image;
	public CopModel _cop;
	public Call_for_papersModel _call_for_papers;

	public FlxwmModel(String code_of_conduct, String background_image, CopModel cop, Call_for_papersModel call_for_papers) {

		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._cop = cop;
		this._call_for_papers = call_for_papers;

	}

}