import java.util.ArrayList;

class RootModel {

	public String state;
	public String privacy;
	public String topic;
	public String description;
	public String timezone;
	public String email;
	public String background_image;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public int id;
	public String start_time;
	public String code_of_conduct;
	public String end_time;
	public String logo;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String name;
	public VersionModel _version;
	public String schedule_published_on;
	public String location_name;

	public RootModel(String state, String privacy, String topic, String description, String timezone, String email, String background_image, String organizer_name, Call_for_papersModel call_for_papers, String organizer_description, ArrayList<Social_linksModel> social_links, String type, int id, String start_time, String code_of_conduct, String end_time, String logo, CreatorModel creator, CopyrightModel copyright, String name, VersionModel version, String schedule_published_on, String location_name) {

		this.state = state;
		this.privacy = privacy;
		this.topic = topic;
		this.description = description;
		this.timezone = timezone;
		this.email = email;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.type = type;
		this.id = id;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.logo = logo;
		this._creator = creator;
		this._copyright = copyright;
		this.name = name;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;

	}

}