import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String end_time;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String logo;
	public String privacy;
	public String email;
	public String topic;
	public CreatorModel _creator;
	public String location_name;
	public String background_image;
	public VersionModel _version;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String description;
	public String name;
	public String timezone;
	public String start_time;
	public int id;
	public String organizer_description;

	public RootModel(CopyrightModel copyright, String code_of_conduct, String end_time, String type, ArrayList<Social_linksModel> social_links, String schedule_published_on, String logo, String privacy, String email, String topic, CreatorModel creator, String location_name, String background_image, VersionModel version, String organizer_name, Call_for_papersModel call_for_papers, String state, String description, String name, String timezone, String start_time, int id, String organizer_description) {

		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.type = type;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.privacy = privacy;
		this.email = email;
		this.topic = topic;
		this._creator = creator;
		this.location_name = location_name;
		this.background_image = background_image;
		this._version = version;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.description = description;
		this.name = name;
		this.timezone = timezone;
		this.start_time = start_time;
		this.id = id;
		this.organizer_description = organizer_description;

	}

}