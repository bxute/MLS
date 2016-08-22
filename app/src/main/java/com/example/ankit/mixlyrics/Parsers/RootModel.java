import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String organizer_description;
	public String email;
	public String schedule_published_on;
	public String topic;
	public String organizer_name;
	public String name;
	public String code_of_conduct;
	public String description;
	public ArrayList<SociallinksModel> sociallinks;
	public String end_time;
	public String starttime;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String privacy;
	public CreatorEmailModel _creatorEmail;
	public String logo;
	public String state;
	public String type;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public int id;
	public String timezone;

	public RootModel(String background_image, String organizer_description, String email, String schedule_published_on, String topic, String organizer_name, String name, String code_of_conduct, String description, ArrayList<SociallinksModel> sociallinks, String end_time, String starttime, Call_for_papersModel call_for_papers, String location_name, String privacy, CreatorEmailModel creatorEmail, String logo, String state, String type, VersionModel version, CopyrightModel copyright, int id, String timezone) {

		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.sociallinks = sociallinks;
		this.end_time = end_time;
		this.starttime = starttime;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.privacy = privacy;
		this._creatorEmail = creatorEmail;
		this.logo = logo;
		this.state = state;
		this.type = type;
		this._version = version;
		this._copyright = copyright;
		this.id = id;
		this.timezone = timezone;

	}

}