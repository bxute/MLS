import java.util.ArrayList;

class RootModel {

	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String code_of_conduct;
	public String email;
	public String organizer_description;
	public String schedule_published_on;
	public String type;
	public String background_image;
	public VersionModel _version;
	public FlackModel _flack;
	public ArrayList<SociallinksModel> sociallinks;
	public CopyrightModel _copyright;
	public String privacy;
	public CreatorEmailModel _creatorEmail;
	public String starttime;

	public RootModel(String description, Call_for_papersModel call_for_papers, String organizer_name, String code_of_conduct, String email, String organizer_description, String schedule_published_on, String type, String background_image, VersionModel version, FlackModel flack, ArrayList<SociallinksModel> sociallinks, CopyrightModel copyright, String privacy, CreatorEmailModel creatorEmail, String starttime) {

		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.background_image = background_image;
		this._version = version;
		this._flack = flack;
		this.sociallinks = sociallinks;
		this._copyright = copyright;
		this.privacy = privacy;
		this._creatorEmail = creatorEmail;
		this.starttime = starttime;

	}

}