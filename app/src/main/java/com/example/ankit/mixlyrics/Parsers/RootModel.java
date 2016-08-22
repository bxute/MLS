import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public FlxwmModel _flxwm;
	public String starttime;
	public ArrayList<SociallinksModel> sociallinks;
	public String type;
	public String email;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public VersioningModel _versioning;
	public CreatorEmailModel _creatorEmail;
	public Callfor_papersModel _callfor_papers;
	public String background_image;
	public String schedule_published_on;
	public String organizer_description;
	public String code_of_conduct;
	public String privacy;

	public RootModel(CopyrightModel copyright, FlxwmModel flxwm, String starttime, ArrayList<SociallinksModel> sociallinks, String type, String email, String organizer_name, Call_for_papersModel call_for_papers, String description, VersioningModel versioning, CreatorEmailModel creatorEmail, Callfor_papersModel callfor_papers, String background_image, String schedule_published_on, String organizer_description, String code_of_conduct, String privacy) {

		this._copyright = copyright;
		this._flxwm = flxwm;
		this.starttime = starttime;
		this.sociallinks = sociallinks;
		this.type = type;
		this.email = email;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._versioning = versioning;
		this._creatorEmail = creatorEmail;
		this._callfor_papers = callfor_papers;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;

	}

}