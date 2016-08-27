import java.util.ArrayList;

class RootModel {

	public String email;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String organizer_description;
	public String description;
	public String location_name;
	public String organizer_name;
	public String background_image;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String topic;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String schedule_published_on;
	public String logo;
	public String state;
	public String timezone;
	public String type;
	public String privacy;
	public VersionModel _version;
	public int id;

	public RootModel(String email, CopyrightModel copyright, String code_of_conduct, String organizer_description, String description, String location_name, String organizer_name, String background_image, String name, ArrayList<Social_linksModel> social_links, String end_time, String topic, CreatorModel creator, Call_for_papersModel call_for_papers, String start_time, String schedule_published_on, String logo, String state, String timezone, String type, String privacy, VersionModel version, int id) {

		this.email = email;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.description = description;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.name = name;
		this.social_links = social_links;
		this.end_time = end_time;
		this.topic = topic;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.state = state;
		this.timezone = timezone;
		this.type = type;
		this.privacy = privacy;
		this._version = version;
		this.id = id;

	}

}