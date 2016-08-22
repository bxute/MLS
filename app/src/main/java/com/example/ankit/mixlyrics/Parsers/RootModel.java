import java.util.ArrayList;

class RootModel {

	public ArrayList<SociallinksModel> sociallinks;
	public String type;
	public String description;
	public String email;
	public String background_image;
	public String starttime;
	public String organizer_name;
	public FullModel _full;
	public String privacy;
	public CreatorEmailModel _creatorEmail;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String code_of_conduct;
	public String organizer_description;

	public RootModel(ArrayList<SociallinksModel> sociallinks, String type, String description, String email, String background_image, String starttime, String organizer_name, FullModel full, String privacy, CreatorEmailModel creatorEmail, Call_for_papersModel call_for_papers, VersionModel version, CopyrightModel copyright, String schedule_published_on, String code_of_conduct, String organizer_description) {

		this.sociallinks = sociallinks;
		this.type = type;
		this.description = description;
		this.email = email;
		this.background_image = background_image;
		this.starttime = starttime;
		this.organizer_name = organizer_name;
		this._full = full;
		this.privacy = privacy;
		this._creatorEmail = creatorEmail;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;

	}

}