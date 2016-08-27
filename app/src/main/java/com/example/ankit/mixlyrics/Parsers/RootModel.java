import java.util.ArrayList;

class RootModel {

	public String type;
	public String timezone;
	public VersionModel _version;
	public String schedule_published_on;
	public String background_image;
	public String logo;
	public String email;
	public String topic;
	public String location_name;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String code_of_conduct;
	public String start_time;
	public CreatorModel _creator;
	public String privacy;
	public String organizer_name;
	public String name;
	public String description;
	public int id;
	public String end_time;

	public RootModel(String type, String timezone, VersionModel version, String schedule_published_on, String background_image, String logo, String email, String topic, String location_name, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String state, Call_for_papersModel call_for_papers, String organizer_description, String code_of_conduct, String start_time, CreatorModel creator, String privacy, String organizer_name, String name, String description, int id, String end_time) {

		this.type = type;
		this.timezone = timezone;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.logo = logo;
		this.email = email;
		this.topic = topic;
		this.location_name = location_name;
		this._copyright = copyright;
		this.social_links = social_links;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._creator = creator;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.name = name;
		this.description = description;
		this.id = id;
		this.end_time = end_time;

	}

}