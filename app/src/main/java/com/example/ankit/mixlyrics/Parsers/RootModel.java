import java.util.ArrayList;

class RootModel {

	public String name;
	public int id;
	public String end_time;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String description;
	public String timezone;
	public CreatorModel _creator;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String logo;
	public String code_of_conduct;
	public String start_time;
	public String email;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String background_image;
	public String location_name;
	public String schedule_published_on;
	public String organizer_description;
	public String topic;

	public RootModel(String name, int id, String end_time, String type, ArrayList<Social_linksModel> social_links, String privacy, String description, String timezone, CreatorModel creator, String state, Call_for_papersModel call_for_papers, String organizer_name, String logo, String code_of_conduct, String start_time, String email, VersionModel version, CopyrightModel copyright, String background_image, String location_name, String schedule_published_on, String organizer_description, String topic) {

		this.name = name;
		this.id = id;
		this.end_time = end_time;
		this.type = type;
		this.social_links = social_links;
		this.privacy = privacy;
		this.description = description;
		this.timezone = timezone;
		this._creator = creator;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.email = email;
		this._version = version;
		this._copyright = copyright;
		this.background_image = background_image;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.topic = topic;

	}

}