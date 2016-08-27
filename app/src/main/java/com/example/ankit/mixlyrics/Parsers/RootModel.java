import java.util.ArrayList;

class RootModel {

	public String email;
	public String description;
	public String privacy;
	public String timezone;
	public String name;
	public String organizer_name;
	public int id;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String location_name;
	public String state;
	public String start_time;
	public String type;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String end_time;
	public VersionModel _version;
	public CreatorModel _creator;
	public String topic;

	public RootModel(String email, String description, String privacy, String timezone, String name, String organizer_name, int id, String code_of_conduct, Call_for_papersModel call_for_papers, String background_image, String location_name, String state, String start_time, String type, CopyrightModel copyright, String schedule_published_on, String organizer_description, ArrayList<Social_linksModel> social_links, String logo, String end_time, VersionModel version, CreatorModel creator, String topic) {

		this.email = email;
		this.description = description;
		this.privacy = privacy;
		this.timezone = timezone;
		this.name = name;
		this.organizer_name = organizer_name;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.location_name = location_name;
		this.state = state;
		this.start_time = start_time;
		this.type = type;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.logo = logo;
		this.end_time = end_time;
		this._version = version;
		this._creator = creator;
		this.topic = topic;

	}

}