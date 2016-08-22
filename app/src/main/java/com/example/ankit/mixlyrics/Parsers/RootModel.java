import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public FlxwmModel _flxwm;
	public String code_of_conduct;
	public String background_image;
	public ArrayList<SociallinksModel> sociallinks;
	public String privacy;
	public Callfor_papersModel _callfor_papers;
	public Call_for_papersModel _call_for_papers;
	public String starttime;
	public String type;
	public CopyrightModel _copyright;
	public String email;
	public String organizer_description;
	public String description;
	public CreatorEmailModel _creatorEmail;
	public String schedule_published_on;
	public VersioningModel _versioning;

	public RootModel(String organizer_name, FlxwmModel flxwm, String code_of_conduct, String background_image, ArrayList<SociallinksModel> sociallinks, String privacy, Callfor_papersModel callfor_papers, Call_for_papersModel call_for_papers, String starttime, String type, CopyrightModel copyright, String email, String organizer_description, String description, CreatorEmailModel creatorEmail, String schedule_published_on, VersioningModel versioning) {

		this.organizer_name = organizer_name;
		this._flxwm = flxwm;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.sociallinks = sociallinks;
		this.privacy = privacy;
		this._callfor_papers = callfor_papers;
		this._call_for_papers = call_for_papers;
		this.starttime = starttime;
		this.type = type;
		this._copyright = copyright;
		this.email = email;
		this.organizer_description = organizer_description;
		this.description = description;
		this._creatorEmail = creatorEmail;
		this.schedule_published_on = schedule_published_on;
		this._versioning = versioning;

	}

}