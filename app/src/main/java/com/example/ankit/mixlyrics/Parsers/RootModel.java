import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public VersionModel _version;
	public String code_of_conduct;
	public String schedule_published_on;
	public String privacy;
	public String location_name;
	public String description;
	public String logo;
	public int id;
	public String end_time;
	public String background_image;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String email;
	public String type;
	public String state;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String topic;
	public String name;

	public RootModel(String organizer_description, VersionModel version, String code_of_conduct, String schedule_published_on, String privacy, String location_name, String description, String logo, int id, String end_time, String background_image, CreatorModel creator, ArrayList<Social_linksModel> social_links, String timezone, String email, String type, String state, String start_time, Call_for_papersModel call_for_papers, String organizer_name, CopyrightModel copyright, String topic, String name) {

		this.organizer_description = organizer_description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.location_name = location_name;
		this.description = description;
		this.logo = logo;
		this.id = id;
		this.end_time = end_time;
		this.background_image = background_image;
		this._creator = creator;
		this.social_links = social_links;
		this.timezone = timezone;
		this.email = email;
		this.type = type;
		this.state = state;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.topic = topic;
		this.name = name;

	}

}