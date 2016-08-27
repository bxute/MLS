import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String timezone;
	public String type;
	public int id;
	public CreatorModel _creator;
	public String end_time;
	public String privacy;
	public String logo;
	public String name;
	public CopyrightModel _copyright;
	public String start_time;
	public String email;
	public String location_name;
	public String schedule_published_on;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public VersionModel _version;
	public String state;
	public String organizer_description;

	public RootModel(String background_image, String organizer_name, Call_for_papersModel call_for_papers, String code_of_conduct, String timezone, String type, int id, CreatorModel creator, String end_time, String privacy, String logo, String name, CopyrightModel copyright, String start_time, String email, String location_name, String schedule_published_on, String topic, ArrayList<Social_linksModel> social_links, String description, VersionModel version, String state, String organizer_description) {

		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.type = type;
		this.id = id;
		this._creator = creator;
		this.end_time = end_time;
		this.privacy = privacy;
		this.logo = logo;
		this.name = name;
		this._copyright = copyright;
		this.start_time = start_time;
		this.email = email;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.social_links = social_links;
		this.description = description;
		this._version = version;
		this.state = state;
		this.organizer_description = organizer_description;

	}

}