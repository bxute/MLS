import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String logo;
	public VersionModel _version;
	public String start_time;
	public String topic;
	public String code_of_conduct;
	public String location_name;
	public String timezone;
	public CopyrightModel _copyright;
	public String end_time;
	public String name;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String state;
	public int id;
	public String background_image;
	public CreatorModel _creator;
	public String description;
	public String type;

	public RootModel(String organizer_description, String organizer_name, ArrayList<Social_linksModel> social_links, String schedule_published_on, String logo, VersionModel version, String start_time, String topic, String code_of_conduct, String location_name, String timezone, CopyrightModel copyright, String end_time, String name, String privacy, Call_for_papersModel call_for_papers, String email, String state, int id, String background_image, CreatorModel creator, String description, String type) {

		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._version = version;
		this.start_time = start_time;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.timezone = timezone;
		this._copyright = copyright;
		this.end_time = end_time;
		this.name = name;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.state = state;
		this.id = id;
		this.background_image = background_image;
		this._creator = creator;
		this.description = description;
		this.type = type;

	}

}