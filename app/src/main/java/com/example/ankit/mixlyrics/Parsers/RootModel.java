import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String type;
	public String organizer_description;
	public String end_time;
	public String start_time;
	public String location_name;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String timezone;
	public int id;
	public String state;
	public String logo;
	public String privacy;
	public String background_image;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String email;
	public String description;

	public RootModel(String organizer_name, String type, String organizer_description, String end_time, String start_time, String location_name, CreatorModel creator, String schedule_published_on, String name, ArrayList<Social_linksModel> social_links, String code_of_conduct, String timezone, int id, String state, String logo, String privacy, String background_image, VersionModel version, CopyrightModel copyright, Call_for_papersModel call_for_papers, String topic, String email, String description) {

		this.organizer_name = organizer_name;
		this.type = type;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.start_time = start_time;
		this.location_name = location_name;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.id = id;
		this.state = state;
		this.logo = logo;
		this.privacy = privacy;
		this.background_image = background_image;
		this._version = version;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.email = email;
		this.description = description;

	}

}