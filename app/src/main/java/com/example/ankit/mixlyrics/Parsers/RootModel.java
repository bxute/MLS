import java.util.ArrayList;

class RootModel {

	public String email;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String privacy;
	public String topic;
	public String logo;
	public String timezone;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String organizer_name;
	public String organizer_description;
	public String location_name;
	public String type;
	public String description;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public int id;
	public String name;
	public String schedule_published_on;
	public String state;
	public String end_time;
	public String background_image;

	public RootModel(String email, Call_for_papersModel call_for_papers, String code_of_conduct, String privacy, String topic, String logo, String timezone, CopyrightModel copyright, CreatorModel creator, String organizer_name, String organizer_description, String location_name, String type, String description, VersionModel version, ArrayList<Social_linksModel> social_links, String start_time, int id, String name, String schedule_published_on, String state, String end_time, String background_image) {

		this.email = email;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.topic = topic;
		this.logo = logo;
		this.timezone = timezone;
		this._copyright = copyright;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.type = type;
		this.description = description;
		this._version = version;
		this.social_links = social_links;
		this.start_time = start_time;
		this.id = id;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.end_time = end_time;
		this.background_image = background_image;

	}

}