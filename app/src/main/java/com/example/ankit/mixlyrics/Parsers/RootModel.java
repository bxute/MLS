import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String privacy;
	public String type;
	public String end_time;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String start_time;
	public int id;
	public String organizer_name;
	public String name;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String timezone;
	public String state;
	public String schedule_published_on;
	public VersionModel _version;
	public String location_name;
	public String logo;
	public String background_image;
	public String topic;

	public RootModel(CopyrightModel copyright, CreatorModel creator, String privacy, String type, String end_time, String code_of_conduct, Call_for_papersModel call_for_papers, String organizer_description, String start_time, int id, String organizer_name, String name, String description, ArrayList<Social_linksModel> social_links, String email, String timezone, String state, String schedule_published_on, VersionModel version, String location_name, String logo, String background_image, String topic) {

		this._copyright = copyright;
		this._creator = creator;
		this.privacy = privacy;
		this.type = type;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.id = id;
		this.organizer_name = organizer_name;
		this.name = name;
		this.description = description;
		this.social_links = social_links;
		this.email = email;
		this.timezone = timezone;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.location_name = location_name;
		this.logo = logo;
		this.background_image = background_image;
		this.topic = topic;

	}

}