import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public CopyrightModel _copyright;
	public String description;
	public String type;
	public String schedule_published_on;
	public String topic;
	public String timezone;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String logo;
	public String organizer_description;
	public VersionModel _version;
	public String name;
	public String email;
	public String background_image;
	public String end_time;
	public int id;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;

	public RootModel(String location_name, String organizer_name, Call_for_papersModel call_for_papers, String privacy, CopyrightModel copyright, String description, String type, String schedule_published_on, String topic, String timezone, CreatorModel creator, String code_of_conduct, String logo, String organizer_description, VersionModel version, String name, String email, String background_image, String end_time, int id, String state, ArrayList<Social_linksModel> social_links, String start_time) {

		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this._copyright = copyright;
		this.description = description;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.timezone = timezone;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._version = version;
		this.name = name;
		this.email = email;
		this.background_image = background_image;
		this.end_time = end_time;
		this.id = id;
		this.state = state;
		this.social_links = social_links;
		this.start_time = start_time;

	}

}