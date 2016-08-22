import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String type;
	public String privacy;
	public FlxwmModel _flxwm;
	public String organizer_name;
	public String background_image;
	public ArrayList<SociallinksModel> sociallinks;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String description;
	public String starttime;
	public VersionModel _version;
	public CreatorEmailModel _creatorEmail;

	public RootModel(String code_of_conduct, String organizer_description, CopyrightModel copyright, String type, String privacy, FlxwmModel flxwm, String organizer_name, String background_image, ArrayList<SociallinksModel> sociallinks, String schedule_published_on, Call_for_papersModel call_for_papers, String email, String description, String starttime, VersionModel version, CreatorEmailModel creatorEmail) {

		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.type = type;
		this.privacy = privacy;
		this._flxwm = flxwm;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.sociallinks = sociallinks;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.description = description;
		this.starttime = starttime;
		this._version = version;
		this._creatorEmail = creatorEmail;

	}

}