import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String organizer_name;
	public String name;
	public String privacy;
	public String background_image;
	public String end_time;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String email;
	public CreatorModel _creator;
	public VersionModel _version;
	public String type;
	public String schedule_published_on;
	public String location_name;
	public String state;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String description;
	public String organizer_description;
	public int id;
	public String topic;

	public RootModel(String start_time, String organizer_name, String name, String privacy, String background_image, String end_time, String code_of_conduct, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String email, CreatorModel creator, VersionModel version, String type, String schedule_published_on, String location_name, String state, String timezone, Call_for_papersModel call_for_papers, String logo, String description, String organizer_description, int id, String topic) {

		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.name = name;
		this.privacy = privacy;
		this.background_image = background_image;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this._copyright = copyright;
		this.email = email;
		this._creator = creator;
		this._version = version;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.state = state;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.description = description;
		this.organizer_description = organizer_description;
		this.id = id;
		this.topic = topic;

	}

}