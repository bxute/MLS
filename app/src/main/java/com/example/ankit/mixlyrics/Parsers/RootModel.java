import java.util.ArrayList;

class RootModel {

	public ArrayList<SociallinksModel> sociallinks;
	public String description;
	public String code_of_conduct;
	public String privacy;
	public CreatorEmailModel _creatorEmail;
	public String organizer_description;
	public FlxwmModel _flxwm;
	public String background_image;
	public String organizer_name;
	public String email;
	public String schedule_published_on;
	public String starttime;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String type;

	public RootModel(ArrayList<SociallinksModel> sociallinks, String description, String code_of_conduct, String privacy, CreatorEmailModel creatorEmail, String organizer_description, FlxwmModel flxwm, String background_image, String organizer_name, String email, String schedule_published_on, String starttime, Call_for_papersModel call_for_papers, CopyrightModel copyright, VersionModel version, String type) {

		this.sociallinks = sociallinks;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._creatorEmail = creatorEmail;
		this.organizer_description = organizer_description;
		this._flxwm = flxwm;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.starttime = starttime;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this._version = version;
		this.type = type;

	}

}