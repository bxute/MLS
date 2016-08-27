import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String email;
	public String start_time;
	public String privacy;
	public String state;
	public String end_time;
	public String location_name;
	public String logo;
	public String topic;
	public String type;
	public VersionModel _version;
	public String organizer_description;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String organizer_name;
	public String background_image;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String timezone;
	public int id;
	public String name;

	public RootModel(String code_of_conduct, String email, String start_time, String privacy, String state, String end_time, String location_name, String logo, String topic, String type, VersionModel version, String organizer_description, CopyrightModel copyright, CreatorModel creator, String organizer_name, String background_image, String schedule_published_on, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String description, String timezone, int id, String name) {

		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.start_time = start_time;
		this.privacy = privacy;
		this.state = state;
		this.end_time = end_time;
		this.location_name = location_name;
		this.logo = logo;
		this.topic = topic;
		this.type = type;
		this._version = version;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.description = description;
		this.timezone = timezone;
		this.id = id;
		this.name = name;

	}

}