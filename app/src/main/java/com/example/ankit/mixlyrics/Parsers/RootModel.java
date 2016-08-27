import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String description;
	public String background_image;
	public CopyrightModel _copyright;
	public String location_name;
	public String topic;
	public int id;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String name;
	public String schedule_published_on;
	public String organizer_description;
	public VersionModel _version;
	public String code_of_conduct;
	public String state;
	public String organizer_name;
	public CreatorModel _creator;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String start_time;
	public String end_time;

	public RootModel(String timezone, String description, String background_image, CopyrightModel copyright, String location_name, String topic, int id, String privacy, ArrayList<Social_linksModel> social_links, String email, String name, String schedule_published_on, String organizer_description, VersionModel version, String code_of_conduct, String state, String organizer_name, CreatorModel creator, String type, Call_for_papersModel call_for_papers, String logo, String start_time, String end_time) {

		this.timezone = timezone;
		this.description = description;
		this.background_image = background_image;
		this._copyright = copyright;
		this.location_name = location_name;
		this.topic = topic;
		this.id = id;
		this.privacy = privacy;
		this.social_links = social_links;
		this.email = email;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.start_time = start_time;
		this.end_time = end_time;

	}

}