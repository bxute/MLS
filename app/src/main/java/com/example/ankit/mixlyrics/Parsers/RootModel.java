import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String location_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String description;
	public String timezone;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public VersionModel _version;
	public String background_image;
	public String logo;
	public String name;
	public int id;
	public String state;
	public String schedule_published_on;
	public String organizer_name;
	public String topic;
	public String start_time;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public CopyrightModel _copyright;

	public RootModel(String organizer_description, String location_name, CreatorModel creator, String code_of_conduct, String description, String timezone, String privacy, ArrayList<Social_linksModel> social_links, String email, VersionModel version, String background_image, String logo, String name, int id, String state, String schedule_published_on, String organizer_name, String topic, String start_time, String end_time, Call_for_papersModel call_for_papers, String type, CopyrightModel copyright) {

		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.timezone = timezone;
		this.privacy = privacy;
		this.social_links = social_links;
		this.email = email;
		this._version = version;
		this.background_image = background_image;
		this.logo = logo;
		this.name = name;
		this.id = id;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.start_time = start_time;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this._copyright = copyright;

	}

}