import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String email;
	public String start_time;
	public String logo;
	public String location_name;
	public String timezone;
	public String schedule_published_on;
	public String type;
	public String name;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String organizer_description;
	public String privacy;
	public VersionModel _version;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String topic;
	public String description;
	public CreatorModel _creator;
	public String end_time;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String background_image, String email, String start_time, String logo, String location_name, String timezone, String schedule_published_on, String type, String name, String state, ArrayList<Social_linksModel> social_links, int id, String organizer_description, String privacy, VersionModel version, String organizer_name, CopyrightModel copyright, String topic, String description, CreatorModel creator, String end_time, String code_of_conduct, Call_for_papersModel call_for_papers) {

		this.background_image = background_image;
		this.email = email;
		this.start_time = start_time;
		this.logo = logo;
		this.location_name = location_name;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.name = name;
		this.state = state;
		this.social_links = social_links;
		this.id = id;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._version = version;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.topic = topic;
		this.description = description;
		this._creator = creator;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;

	}

}