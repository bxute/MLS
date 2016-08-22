import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String description;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String schedule_published_on;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String starttime;
	public String organizer_description;
	public String type;
	public ArrayList<SociallinksModel> sociallinks;
	public String email;
	public String code_of_conduct;
	public CreatorEmailModel _creatorEmail;

	public RootModel(VersionModel version, String description, CopyrightModel copyright, String organizer_name, String schedule_published_on, String privacy, Call_for_papersModel call_for_papers, String background_image, String starttime, String organizer_description, String type, ArrayList<SociallinksModel> sociallinks, String email, String code_of_conduct, CreatorEmailModel creatorEmail) {

		this._version = version;
		this.description = description;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.starttime = starttime;
		this.organizer_description = organizer_description;
		this.type = type;
		this.sociallinks = sociallinks;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._creatorEmail = creatorEmail;

	}

}