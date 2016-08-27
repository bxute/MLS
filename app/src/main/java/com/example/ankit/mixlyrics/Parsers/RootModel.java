import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String logo;
	public String topic;
	public String organizer_name;
	public String location_name;
	public CreatorModel _creator;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String organizer_description;
	public String type;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String timezone;
	public String privacy;
	public String background_image;
	public String end_time;
	public String description;
	public String state;
	public String name;
	public int id;
	public String code_of_conduct;

	public RootModel(String schedule_published_on, String logo, String topic, String organizer_name, String location_name, CreatorModel creator, VersionModel version, ArrayList<Social_linksModel> social_links, String start_time, String organizer_description, String type, String email, Call_for_papersModel call_for_papers, CopyrightModel copyright, String timezone, String privacy, String background_image, String end_time, String description, String state, String name, int id, String code_of_conduct) {

		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._creator = creator;
		this._version = version;
		this.social_links = social_links;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.type = type;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.timezone = timezone;
		this.privacy = privacy;
		this.background_image = background_image;
		this.end_time = end_time;
		this.description = description;
		this.state = state;
		this.name = name;
		this.id = id;
		this.code_of_conduct = code_of_conduct;

	}

}