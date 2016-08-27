import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String privacy;
	public String logo;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String name;
	public String schedule_published_on;
	public String description;
	public int id;
	public String email;
	public String start_time;
	public String location_name;
	public String topic;
	public String state;
	public String end_time;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String organizer_name;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public VersionModel _version;

	public RootModel(String background_image, String privacy, String logo, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String type, String name, String schedule_published_on, String description, int id, String email, String start_time, String location_name, String topic, String state, String end_time, String code_of_conduct, CreatorModel creator, String organizer_name, String organizer_description, Call_for_papersModel call_for_papers, String timezone, VersionModel version) {

		this.background_image = background_image;
		this.privacy = privacy;
		this.logo = logo;
		this._copyright = copyright;
		this.social_links = social_links;
		this.type = type;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.id = id;
		this.email = email;
		this.start_time = start_time;
		this.location_name = location_name;
		this.topic = topic;
		this.state = state;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._version = version;

	}

}