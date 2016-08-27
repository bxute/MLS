import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String background_image;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String description;
	public String state;
	public String logo;
	public String privacy;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String timezone;
	public int id;
	public String location_name;
	public String organizer_description;
	public String organizer_name;
	public VersionModel _version;
	public String topic;
	public String code_of_conduct;

	public RootModel(String start_time, String email, Call_for_papersModel call_for_papers, String name, String background_image, String type, ArrayList<Social_linksModel> social_links, String end_time, String description, String state, String logo, String privacy, CreatorModel creator, CopyrightModel copyright, String schedule_published_on, String timezone, int id, String location_name, String organizer_description, String organizer_name, VersionModel version, String topic, String code_of_conduct) {

		this.start_time = start_time;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.background_image = background_image;
		this.type = type;
		this.social_links = social_links;
		this.end_time = end_time;
		this.description = description;
		this.state = state;
		this.logo = logo;
		this.privacy = privacy;
		this._creator = creator;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.id = id;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this._version = version;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;

	}

}