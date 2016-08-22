import java.util.ArrayList;

class RootModel {

	public CreatorEmailModel _creatorEmail;
	public CopyrightModel _copyright;
	public ArrayList<SociallinksModel> sociallinks;
	public String description;
	public String background_image;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String organizer_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String starttime;
	public String privacy;
	public FullModel _full;
	public String organizer_description;
	public String email;

	public RootModel(CreatorEmailModel creatorEmail, CopyrightModel copyright, ArrayList<SociallinksModel> sociallinks, String description, String background_image, VersionModel version, Call_for_papersModel call_for_papers, String type, String organizer_name, String code_of_conduct, String schedule_published_on, String starttime, String privacy, FullModel full, String organizer_description, String email) {

		this._creatorEmail = creatorEmail;
		this._copyright = copyright;
		this.sociallinks = sociallinks;
		this.description = description;
		this.background_image = background_image;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.starttime = starttime;
		this.privacy = privacy;
		this._full = full;
		this.organizer_description = organizer_description;
		this.email = email;

	}

}