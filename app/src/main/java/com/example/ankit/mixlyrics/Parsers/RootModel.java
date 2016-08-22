import java.util.ArrayList;

class RootModel {

	public ArrayList<SociallinksModel> sociallinks;
	public String email;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String type;
	public CreatorEmailModel _creatorEmail;
	public VersionModel _version;
	public FlxwmModel _flxwm;
	public String organizer_description;
	public String code_of_conduct;
	public String schedule_published_on;
	public String starttime;
	public String privacy;
	public String organizer_name;
	public CopyrightModel _copyright;

	public RootModel(ArrayList<SociallinksModel> sociallinks, String email, String description, Call_for_papersModel call_for_papers, String background_image, String type, CreatorEmailModel creatorEmail, VersionModel version, FlxwmModel flxwm, String organizer_description, String code_of_conduct, String schedule_published_on, String starttime, String privacy, String organizer_name, CopyrightModel copyright) {

		this.sociallinks = sociallinks;
		this.email = email;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.type = type;
		this._creatorEmail = creatorEmail;
		this._version = version;
		this._flxwm = flxwm;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.starttime = starttime;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._copyright = copyright;

	}

}