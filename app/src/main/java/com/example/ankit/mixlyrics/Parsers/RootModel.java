import java.util.ArrayList;

class RootModel {

	public String background_image;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String email;
	public String topic;
	public CreatorEmailModel _creatorEmail;
	public String organizer_description;
	public String privacy;
	public VersionModel _version;
	public String description;
	public String state;
	public String name;
	public ArrayList<SociallinksModel> sociallinks;
	public String end_time;
	public String starttime;
	public String schedule_published_on;
	public String type;
	public String location_name;
	public String organizer_name;
	public String logo;
	public CopyrightModel _copyright;
	public String timezone;

	public RootModel(String background_image, int id, Call_for_papersModel call_for_papers, String code_of_conduct, String email, String topic, CreatorEmailModel creatorEmail, String organizer_description, String privacy, VersionModel version, String description, String state, String name, ArrayList<SociallinksModel> sociallinks, String end_time, String starttime, String schedule_published_on, String type, String location_name, String organizer_name, String logo, CopyrightModel copyright, String timezone) {

		this.background_image = background_image;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.topic = topic;
		this._creatorEmail = creatorEmail;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._version = version;
		this.description = description;
		this.state = state;
		this.name = name;
		this.sociallinks = sociallinks;
		this.end_time = end_time;
		this.starttime = starttime;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this._copyright = copyright;
		this.timezone = timezone;

	}

}