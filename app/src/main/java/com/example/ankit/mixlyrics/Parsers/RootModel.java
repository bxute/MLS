import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public ArrayList<SociallinksModel> sociallinks;
	public String starttime;
	public String email;
	public String schedule_published_on;
	public String code_of_conduct;
	public String background_image;
	public String privacy;
	public String organizer_description;
	public VersionModel _version;
	public FlxwmModel _flxwm;
	public CreatorEmailModel _creatorEmail;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String type;
	public String description;

	public RootModel(Call_for_papersModel call_for_papers, ArrayList<SociallinksModel> sociallinks, String starttime, String email, String schedule_published_on, String code_of_conduct, String background_image, String privacy, String organizer_description, VersionModel version, FlxwmModel flxwm, CreatorEmailModel creatorEmail, String organizer_name, CopyrightModel copyright, String type, String description) {

		this._call_for_papers = call_for_papers;
		this.sociallinks = sociallinks;
		this.starttime = starttime;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._version = version;
		this._flxwm = flxwm;
		this._creatorEmail = creatorEmail;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.type = type;
		this.description = description;

	}

}