import java.util.ArrayList;

class RootModel {

	public String name;
	public String email;
	public String end_time;
	public String timezone;
	public String type;
	public int id;
	public String description;
	public String organizer_name;
	public String code_of_conduct;
	public VersionModel _version;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String location_name;
	public String schedule_published_on;
	public String start_time;
	public String privacy;
	public String logo;
	public String state;
	public String background_image;

	public RootModel(String name, String email, String end_time, String timezone, String type, int id, String description, String organizer_name, String code_of_conduct, VersionModel version, String topic, Call_for_papersModel call_for_papers, CreatorModel creator, String organizer_description, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String location_name, String schedule_published_on, String start_time, String privacy, String logo, String state, String background_image) {

		this.name = name;
		this.email = email;
		this.end_time = end_time;
		this.timezone = timezone;
		this.type = type;
		this.id = id;
		this.description = description;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._copyright = copyright;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.privacy = privacy;
		this.logo = logo;
		this.state = state;
		this.background_image = background_image;

	}

}