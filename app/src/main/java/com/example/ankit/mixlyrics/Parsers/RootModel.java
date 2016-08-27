import java.util.ArrayList;

class RootModel {

	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public int id;
	public CopyrightModel _copyright;
	public String type;
	public String privacy;
	public String background_image;
	public String organizer_description;
	public String schedule_published_on;
	public VersionModel _version;
	public String logo;
	public String name;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String code_of_conduct;
	public String email;
	public String state;
	public String description;
	public String organizer_name;
	public CreatorModel _creator;
	public String location_name;

	public RootModel(String end_time, Call_for_papersModel call_for_papers, String topic, int id, CopyrightModel copyright, String type, String privacy, String background_image, String organizer_description, String schedule_published_on, VersionModel version, String logo, String name, String timezone, ArrayList<Social_linksModel> social_links, String start_time, String code_of_conduct, String email, String state, String description, String organizer_name, CreatorModel creator, String location_name) {

		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.id = id;
		this._copyright = copyright;
		this.type = type;
		this.privacy = privacy;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.logo = logo;
		this.name = name;
		this.timezone = timezone;
		this.social_links = social_links;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.state = state;
		this.description = description;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.location_name = location_name;

	}

}