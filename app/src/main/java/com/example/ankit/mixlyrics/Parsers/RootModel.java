import java.util.ArrayList;

class RootModel {

	public String location_name;
	public VersionModel _version;
	public String email;
	public String end_time;
	public String name;
	public String organizer_name;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String state;
	public String schedule_published_on;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String timezone;
	public String topic;
	public String type;
	public String logo;
	public String organizer_description;
	public String background_image;
	public int id;
	public CopyrightModel _copyright;
	public String start_time;

	public RootModel(String location_name, VersionModel version, String email, String end_time, String name, String organizer_name, String code_of_conduct, CreatorModel creator, String state, String schedule_published_on, String privacy, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String description, String timezone, String topic, String type, String logo, String organizer_description, String background_image, int id, CopyrightModel copyright, String start_time) {

		this.location_name = location_name;
		this._version = version;
		this.email = email;
		this.end_time = end_time;
		this.name = name;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.description = description;
		this.timezone = timezone;
		this.topic = topic;
		this.type = type;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.id = id;
		this._copyright = copyright;
		this.start_time = start_time;

	}

}