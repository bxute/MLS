import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String type;
	public String starttime;
	public String code_of_conduct;
	public String description;
	public String background_image;
	public FlxwmModel _flxwm;
	public String email;
	public CreatorEmailModel _creatorEmail;
	public String organizer_name;
	public String organizer_description;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public ArrayList<SociallinksModel> sociallinks;
	public String privacy;
	public VersioningModel _versioning;

	public RootModel(Call_for_papersModel call_for_papers, String type, String starttime, String code_of_conduct, String description, String background_image, FlxwmModel flxwm, String email, CreatorEmailModel creatorEmail, String organizer_name, String organizer_description, String schedule_published_on, CopyrightModel copyright, ArrayList<SociallinksModel> sociallinks, String privacy, VersioningModel versioning) {

		this._call_for_papers = call_for_papers;
		this.type = type;
		this.starttime = starttime;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.background_image = background_image;
		this._flxwm = flxwm;
		this.email = email;
		this._creatorEmail = creatorEmail;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.sociallinks = sociallinks;
		this.privacy = privacy;
		this._versioning = versioning;

	}

}