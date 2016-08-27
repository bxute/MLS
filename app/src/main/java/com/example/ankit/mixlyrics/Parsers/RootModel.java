import java.util.ArrayList;

class RootModel {

	public String topic;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String end_time;
	public String code_of_conduct;
	public String start_time;
	public String location_name;
	public String organizer_description;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String email;
	public String logo;
	public CreatorModel _creator;
	public String description;
	public String privacy;
	public String state;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String name;
	public int id;
	public String timezone;

	public RootModel(String topic, String organizer_name, ArrayList<Social_linksModel> social_links, String background_image, String end_time, String code_of_conduct, String start_time, String location_name, String organizer_description, String type, Call_for_papersModel call_for_papers, VersionModel version, String email, String logo, CreatorModel creator, String description, String privacy, String state, String schedule_published_on, CopyrightModel copyright, String name, int id, String timezone) {

		this.topic = topic;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.background_image = background_image;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.email = email;
		this.logo = logo;
		this._creator = creator;
		this.description = description;
		this.privacy = privacy;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.name = name;
		this.id = id;
		this.timezone = timezone;

	}

}