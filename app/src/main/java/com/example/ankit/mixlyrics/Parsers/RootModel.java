import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String logo;
	public String organizer_name;
	public String name;
	public String privacy;
	public VersionModel _version;
	public String organizer_description;
	public String description;
	public String starttime;
	public String type;
	public String location_name;
	public String code_of_conduct;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String state;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String timezone;

	public RootModel(String background_image, String logo, String organizer_name, String name, String privacy, VersionModel version, String organizer_description, String description, String starttime, String type, String location_name, String code_of_conduct, String topic, Call_for_papersModel call_for_papers, int id, CopyrightModel copyright, String schedule_published_on, CreatorModel creator, String state, String end_time, ArrayList<Social_linksModel> social_links, String email, String timezone) {

		this.background_image = background_image;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.name = name;
		this.privacy = privacy;
		this._version = version;
		this.organizer_description = organizer_description;
		this.description = description;
		this.starttime = starttime;
		this.type = type;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.state = state;
		this.end_time = end_time;
		this.social_links = social_links;
		this.email = email;
		this.timezone = timezone;

	}

}