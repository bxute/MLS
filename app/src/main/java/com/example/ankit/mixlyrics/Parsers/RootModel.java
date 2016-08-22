import java.util.ArrayList;

class RootModel {

	public FlxwmModel _flxwm;
	public String email;
	public String description;
	public String schedule_published_on;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public ArrayList<SociallinksModel> sociallinks;
	public String background_image;
	public String code_of_conduct;
	public String privacy;
	public CopyrightModel _copyright;
	public Callfor_papersModel _callfor_papers;
	public String starttime;
	public VersioningModel _versioning;
	public CreatorEmailModel _creatorEmail;
	public String organizer_name;

	public RootModel(FlxwmModel flxwm, String email, String description, String schedule_published_on, String organizer_description, Call_for_papersModel call_for_papers, String type, ArrayList<SociallinksModel> sociallinks, String background_image, String code_of_conduct, String privacy, CopyrightModel copyright, Callfor_papersModel callfor_papers, String starttime, VersioningModel versioning, CreatorEmailModel creatorEmail, String organizer_name) {

		this._flxwm = flxwm;
		this.email = email;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.sociallinks = sociallinks;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._copyright = copyright;
		this._callfor_papers = callfor_papers;
		this.starttime = starttime;
		this._versioning = versioning;
		this._creatorEmail = creatorEmail;
		this.organizer_name = organizer_name;

	}

}