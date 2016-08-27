import java.util.ArrayList;

class RootModel {

	public String state;
	public CopyrightModel _copyright;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String schedule_published_on;
	public String email;
	public String privacy;
	public String background_image;
	public String logo;
	public String start_time;
	public String type;
	public String name;
	public String timezone;
	public String topic;
	public String code_of_conduct;
	public String organizer_name;
	public String description;
	public VersionModel _version;
	public CreatorModel _creator;
	public String end_time;
	public String organizer_description;

	public RootModel(String state, CopyrightModel copyright, int id, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String location_name, String schedule_published_on, String email, String privacy, String background_image, String logo, String start_time, String type, String name, String timezone, String topic, String code_of_conduct, String organizer_name, String description, VersionModel version, CreatorModel creator, String end_time, String organizer_description) {

		this.state = state;
		this._copyright = copyright;
		this.id = id;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.privacy = privacy;
		this.background_image = background_image;
		this.logo = logo;
		this.start_time = start_time;
		this.type = type;
		this.name = name;
		this.timezone = timezone;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.description = description;
		this._version = version;
		this._creator = creator;
		this.end_time = end_time;
		this.organizer_description = organizer_description;

	}

}