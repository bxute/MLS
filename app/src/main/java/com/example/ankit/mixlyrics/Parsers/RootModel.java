import java.util.ArrayList;

class RootModel {

	public CreatorEmailModel _creatorEmail;
	public CopyrightModel _copyright;
	public String email;
	public String description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String organizer_description;
	public String background_image;
	public String schedule_published_on;
	public String privacy;
	public FlxwmModel _flxwm;
	public ArrayList<SociallinksModel> sociallinks;
	public String starttime;
	public VersionModel _version;
	public String organizer_name;

	public RootModel(CreatorEmailModel creatorEmail, CopyrightModel copyright, String email, String description, String code_of_conduct, Call_for_papersModel call_for_papers, String type, String organizer_description, String background_image, String schedule_published_on, String privacy, FlxwmModel flxwm, ArrayList<SociallinksModel> sociallinks, String starttime, VersionModel version, String organizer_name) {

		this._creatorEmail = creatorEmail;
		this._copyright = copyright;
		this.email = email;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._flxwm = flxwm;
		this.sociallinks = sociallinks;
		this.starttime = starttime;
		this._version = version;
		this.organizer_name = organizer_name;

	}

}