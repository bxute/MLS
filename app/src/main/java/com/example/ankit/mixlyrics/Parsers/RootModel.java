import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public int id;
	public String email;
	public String organizer_name;
	public String state;
	public String location_name;
	public String start_time;
	public String code_of_conduct;
	public String background_image;
	public String timezone;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String privacy;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String schedule_published_on;
	public String description;
	public String organizer_description;
	public VersionModel _version;
	public String logo;
	public CopyrightModel _copyright;

	public RootModel(CreatorModel creator, int id, String email, String organizer_name, String state, String location_name, String start_time, String code_of_conduct, String background_image, String timezone, String type, ArrayList<Social_linksModel> social_links, String topic, String privacy, String end_time, Call_for_papersModel call_for_papers, String name, String schedule_published_on, String description, String organizer_description, VersionModel version, String logo, CopyrightModel copyright) {

		this._creator = creator;
		this.id = id;
		this.email = email;
		this.organizer_name = organizer_name;
		this.state = state;
		this.location_name = location_name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.timezone = timezone;
		this.type = type;
		this.social_links = social_links;
		this.topic = topic;
		this.privacy = privacy;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.organizer_description = organizer_description;
		this._version = version;
		this.logo = logo;
		this._copyright = copyright;

	}

}