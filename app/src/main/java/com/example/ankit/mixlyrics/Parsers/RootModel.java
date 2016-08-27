import java.util.ArrayList;

class RootModel {

	public String email;
	public CopyrightModel _copyright;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String state;
	public String organizer_description;
	public String name;
	public String privacy;
	public String schedule_published_on;
	public String location_name;
	public CreatorModel _creator;
	public int id;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String code_of_conduct;
	public String organizer_name;
	public String timezone;
	public VersionModel _version;
	public String background_image;
	public String topic;
	public String end_time;

	public RootModel(String email, CopyrightModel copyright, String start_time, ArrayList<Social_linksModel> social_links, String logo, String state, String organizer_description, String name, String privacy, String schedule_published_on, String location_name, CreatorModel creator, int id, String type, Call_for_papersModel call_for_papers, String description, String code_of_conduct, String organizer_name, String timezone, VersionModel version, String background_image, String topic, String end_time) {

		this.email = email;
		this._copyright = copyright;
		this.start_time = start_time;
		this.social_links = social_links;
		this.logo = logo;
		this.state = state;
		this.organizer_description = organizer_description;
		this.name = name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._creator = creator;
		this.id = id;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._version = version;
		this.background_image = background_image;
		this.topic = topic;
		this.end_time = end_time;

	}

}