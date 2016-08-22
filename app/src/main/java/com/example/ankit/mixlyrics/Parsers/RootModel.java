import java.util.ArrayList;

class RootModel {

	public ArrayList<SociallinksModel> sociallinks;
	public VersionModel _version;
	public String code_of_conduct;
	public CreatorEmailModel _creatorEmail;
	public Call_for_papersModel _call_for_papers;
	public String starttime;
	public String organizer_description;
	public CopyrightModel _copyright;
	public FlxwmModel _flxwm;
	public String background_image;
	public String description;
	public String privacy;
	public String schedule_published_on;
	public String organizer_name;
	public String email;
	public String type;

	public RootModel(ArrayList<SociallinksModel> sociallinks, VersionModel version, String code_of_conduct, CreatorEmailModel creatorEmail, Call_for_papersModel call_for_papers, String starttime, String organizer_description, CopyrightModel copyright, FlxwmModel flxwm, String background_image, String description, String privacy, String schedule_published_on, String organizer_name, String email, String type) {

		this.sociallinks = sociallinks;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._creatorEmail = creatorEmail;
		this._call_for_papers = call_for_papers;
		this.starttime = starttime;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this._flxwm = flxwm;
		this.background_image = background_image;
		this.description = description;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.email = email;
		this.type = type;

	}

}