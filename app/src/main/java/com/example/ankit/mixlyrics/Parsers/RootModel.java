import java.util.ArrayList;

class RootModel {

	public String privacy;
	public CreatorEmailModel _creatorEmail;
	public String code_of_conduct;
	public String background_image;
	public String organizer_name;
	public ArrayList<SociallinksModel> sociallinks;
	public FlxwmModel _flxwm;
	public String starttime;
	public String schedule_published_on;
	public VersionModel _version;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String email;
	public String type;
	public CopyrightModel _copyright;

	public RootModel(String privacy, CreatorEmailModel creatorEmail, String code_of_conduct, String background_image, String organizer_name, ArrayList<SociallinksModel> sociallinks, FlxwmModel flxwm, String starttime, String schedule_published_on, VersionModel version, String organizer_description, Call_for_papersModel call_for_papers, String description, String email, String type, CopyrightModel copyright) {

		this.privacy = privacy;
		this._creatorEmail = creatorEmail;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.sociallinks = sociallinks;
		this._flxwm = flxwm;
		this.starttime = starttime;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.email = email;
		this.type = type;
		this._copyright = copyright;

	}

}