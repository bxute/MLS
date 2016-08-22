import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String organizer_description;
	public String background_image;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public VersionModel _version;
	public String description;
	public String logo;
	public String end_time;
	public String name;
	public CreatorModel _creator;
	public String timezone;
	public String privacy;
	public String state;
	public int id;
	public String location_name;
	public String code_of_conduct;
	public String start_time;

	public RootModel(String organizer_name, String organizer_description, String background_image, String topic, Call_for_papersModel call_for_papers, String schedule_published_on, CopyrightModel copyright, String email, ArrayList<Social_linksModel> social_links, String type, VersionModel version, String description, String logo, String end_time, String name, CreatorModel creator, String timezone, String privacy, String state, int id, String location_name, String code_of_conduct, String start_time) {

		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.email = email;
		this.social_links = social_links;
		this.type = type;
		this._version = version;
		this.description = description;
		this.logo = logo;
		this.end_time = end_time;
		this.name = name;
		this._creator = creator;
		this.timezone = timezone;
		this.privacy = privacy;
		this.state = state;
		this.id = id;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;

	}

}