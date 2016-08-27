import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String code_of_conduct;
	public String description;
	public String organizer_description;
	public String privacy;
	public String start_time;
	public String logo;
	public String timezone;
	public String topic;
	public String organizer_name;
	public String state;
	public CreatorModel _creator;
	public int id;
	public String end_time;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String background_image;
	public String location_name;
	public String email;
	public VersionModel _version;

	public RootModel(CopyrightModel copyright, Call_for_papersModel call_for_papers, String type, String code_of_conduct, String description, String organizer_description, String privacy, String start_time, String logo, String timezone, String topic, String organizer_name, String state, CreatorModel creator, int id, String end_time, String name, ArrayList<Social_linksModel> social_links, String schedule_published_on, String background_image, String location_name, String email, VersionModel version) {

		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.start_time = start_time;
		this.logo = logo;
		this.timezone = timezone;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.state = state;
		this._creator = creator;
		this.id = id;
		this.end_time = end_time;
		this.name = name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.location_name = location_name;
		this.email = email;
		this._version = version;

	}

}