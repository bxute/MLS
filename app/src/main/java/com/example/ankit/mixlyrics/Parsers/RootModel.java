import java.util.ArrayList;

class RootModel {

	public int id;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String organizer_description;
	public String organizer_name;
	public String email;
	public String privacy;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String name;
	public String description;
	public String code_of_conduct;
	public String background_image;
	public String timezone;
	public String state;
	public String logo;
	public CreatorModel _creator;
	public String end_time;
	public String location_name;
	public CopyrightModel _copyright;
	public String type;
	public VersionModel _version;

	public RootModel(int id, Call_for_papersModel call_for_papers, String schedule_published_on, String organizer_description, String organizer_name, String email, String privacy, String topic, ArrayList<Social_linksModel> social_links, String start_time, String name, String description, String code_of_conduct, String background_image, String timezone, String state, String logo, CreatorModel creator, String end_time, String location_name, CopyrightModel copyright, String type, VersionModel version) {

		this.id = id;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.email = email;
		this.privacy = privacy;
		this.topic = topic;
		this.social_links = social_links;
		this.start_time = start_time;
		this.name = name;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.timezone = timezone;
		this.state = state;
		this.logo = logo;
		this._creator = creator;
		this.end_time = end_time;
		this.location_name = location_name;
		this._copyright = copyright;
		this.type = type;
		this._version = version;

	}

}