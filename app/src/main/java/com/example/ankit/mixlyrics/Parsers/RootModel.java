import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String email;
	public String logo;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String state;
	public String schedule_published_on;
	public int id;
	public CreatorModel _creator;
	public String timezone;
	public String location_name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String description;
	public String topic;
	public String end_time;
	public String privacy;
	public String code_of_conduct;
	public String organizer_description;

	public RootModel(String background_image, String email, String logo, String start_time, ArrayList<Social_linksModel> social_links, String name, String organizer_name, CopyrightModel copyright, String state, String schedule_published_on, int id, CreatorModel creator, String timezone, String location_name, VersionModel version, Call_for_papersModel call_for_papers, String type, String description, String topic, String end_time, String privacy, String code_of_conduct, String organizer_description) {

		this.background_image = background_image;
		this.email = email;
		this.logo = logo;
		this.start_time = start_time;
		this.social_links = social_links;
		this.name = name;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._creator = creator;
		this.timezone = timezone;
		this.location_name = location_name;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.description = description;
		this.topic = topic;
		this.end_time = end_time;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;

	}

}