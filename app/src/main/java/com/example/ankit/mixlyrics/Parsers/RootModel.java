import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String description;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public ArrayList<SociallinksModel> sociallinks;
	public String email;
	public FlxwmModel _flxwm;
	public String organizer_description;
	public String background_image;
	public String privacy;
	public VersioningModel _versioning;
	public CreatorEmailModel _creatorEmail;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String starttime;

	public RootModel(String code_of_conduct, String description, String type, Call_for_papersModel call_for_papers, String organizer_name, ArrayList<SociallinksModel> sociallinks, String email, FlxwmModel flxwm, String organizer_description, String background_image, String privacy, VersioningModel versioning, CreatorEmailModel creatorEmail, String schedule_published_on, CopyrightModel copyright, String starttime) {

		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.sociallinks = sociallinks;
		this.email = email;
		this._flxwm = flxwm;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.privacy = privacy;
		this._versioning = versioning;
		this._creatorEmail = creatorEmail;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.starttime = starttime;

	}

}