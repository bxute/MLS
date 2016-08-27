import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public int id;
	public String start_time;
	public String type;
	public String organizer_description;
	public String description;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String timezone;
	public String code_of_conduct;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String background_image;
	public String schedule_published_on;
	public String organizer_name;
	public CreatorModel _creator;
	public String location_name;
	public String state;
	public String topic;
	public String end_time;
	public String email;

	public RootModel(CopyrightModel copyright, int id, String start_time, String type, String organizer_description, String description, String privacy, Call_for_papersModel call_for_papers, String logo, String timezone, String code_of_conduct, String name, ArrayList<Social_linksModel> social_links, VersionModel version, String background_image, String schedule_published_on, String organizer_name, CreatorModel creator, String location_name, String state, String topic, String end_time, String email) {

		this._copyright = copyright;
		this.id = id;
		this.start_time = start_time;
		this.type = type;
		this.organizer_description = organizer_description;
		this.description = description;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.social_links = social_links;
		this._version = version;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.location_name = location_name;
		this.state = state;
		this.topic = topic;
		this.end_time = end_time;
		this.email = email;

	}

}