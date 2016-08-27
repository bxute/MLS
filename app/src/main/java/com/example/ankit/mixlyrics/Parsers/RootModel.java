import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String timezone;
	public int id;
	public String end_time;
	public CreatorModel _creator;
	public String organizer_description;
	public String background_image;
	public String privacy;
	public String name;
	public CopyrightModel _copyright;
	public String location_name;
	public String topic;
	public String start_time;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String type;
	public String description;
	public String state;
	public String email;

	public RootModel(String code_of_conduct, String schedule_published_on, ArrayList<Social_linksModel> social_links, String logo, String timezone, int id, String end_time, CreatorModel creator, String organizer_description, String background_image, String privacy, String name, CopyrightModel copyright, String location_name, String topic, String start_time, VersionModel version, Call_for_papersModel call_for_papers, String organizer_name, String type, String description, String state, String email) {

		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.logo = logo;
		this.timezone = timezone;
		this.id = id;
		this.end_time = end_time;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.privacy = privacy;
		this.name = name;
		this._copyright = copyright;
		this.location_name = location_name;
		this.topic = topic;
		this.start_time = start_time;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.type = type;
		this.description = description;
		this.state = state;
		this.email = email;

	}

}