import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String state;
	public String logo;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String end_time;
	public String background_image;
	public String email;
	public String type;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String description;
	public int id;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String name;
	public String privacy;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String timezone;
	public String location_name;

	public RootModel(String organizer_description, String state, String logo, String schedule_published_on, CreatorModel creator, String end_time, String background_image, String email, String type, CopyrightModel copyright, VersionModel version, String description, int id, String start_time, ArrayList<Social_linksModel> social_links, String topic, String name, String privacy, String organizer_name, Call_for_papersModel call_for_papers, String code_of_conduct, String timezone, String location_name) {

		this.organizer_description = organizer_description;
		this.state = state;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.end_time = end_time;
		this.background_image = background_image;
		this.email = email;
		this.type = type;
		this._copyright = copyright;
		this._version = version;
		this.description = description;
		this.id = id;
		this.start_time = start_time;
		this.social_links = social_links;
		this.topic = topic;
		this.name = name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.location_name = location_name;

	}

}