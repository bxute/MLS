import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String organizer_description;
	public VersioningModel _versioning;
	public FlxwmModel _flxwm;
	public String background_image;
	public String organizer_name;
	public String description;
	public String schedule_published_on;
	public String starttime;
	public String code_of_conduct;
	public String type;
	public String privacy;
	public String email;
	public ArrayList<SociallinksModel> sociallinks;
	public Callfor_papersModel _callfor_papers;
	public CreatorEmailModel _creatorEmail;

	public RootModel(Call_for_papersModel call_for_papers, CopyrightModel copyright, String organizer_description, VersioningModel versioning, FlxwmModel flxwm, String background_image, String organizer_name, String description, String schedule_published_on, String starttime, String code_of_conduct, String type, String privacy, String email, ArrayList<SociallinksModel> sociallinks, Callfor_papersModel callfor_papers, CreatorEmailModel creatorEmail) {

		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this._versioning = versioning;
		this._flxwm = flxwm;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.starttime = starttime;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.privacy = privacy;
		this.email = email;
		this.sociallinks = sociallinks;
		this._callfor_papers = callfor_papers;
		this._creatorEmail = creatorEmail;

	}

}