import java.util.ArrayList;

class RootModel {

	public String state;
	public String name;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public VersionModel _version;
	public String type;
	public String start_time;
	public String organizer_description;
	public String organizer_name;
	public String schedule_published_on;
	public String timezone;
	public CreatorModel _creator;
	public String end_time;
	public String topic;
	public String privacy;
	public String location_name;
	public CopyrightModel _copyright;
	public int id;
	public String background_image;

	public RootModel(String state, String name, String logo, ArrayList<Social_linksModel> social_links, String description, String email, Call_for_papersModel call_for_papers, String code_of_conduct, VersionModel version, String type, String start_time, String organizer_description, String organizer_name, String schedule_published_on, String timezone, CreatorModel creator, String end_time, String topic, String privacy, String location_name, CopyrightModel copyright, int id, String background_image) {

		this.state = state;
		this.name = name;
		this.logo = logo;
		this.social_links = social_links;
		this.description = description;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.type = type;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this._creator = creator;
		this.end_time = end_time;
		this.topic = topic;
		this.privacy = privacy;
		this.location_name = location_name;
		this._copyright = copyright;
		this.id = id;
		this.background_image = background_image;

	}

}