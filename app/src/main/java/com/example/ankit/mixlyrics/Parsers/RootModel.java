import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String privacy;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String code_of_conduct;
	public int id;
	public String state;
	public CopyrightModel _copyright;
	public String name;
	public String background_image;
	public CreatorModel _creator;
	public String type;
	public String schedule_published_on;
	public String end_time;
	public String description;
	public String location_name;
	public String timezone;
	public String organizer_name;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String start_time;

	public RootModel(VersionModel version, String privacy, String topic, Call_for_papersModel call_for_papers, String email, String code_of_conduct, int id, String state, CopyrightModel copyright, String name, String background_image, CreatorModel creator, String type, String schedule_published_on, String end_time, String description, String location_name, String timezone, String organizer_name, String logo, ArrayList<Social_linksModel> social_links, String organizer_description, String start_time) {

		this._version = version;
		this.privacy = privacy;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.state = state;
		this._copyright = copyright;
		this.name = name;
		this.background_image = background_image;
		this._creator = creator;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.description = description;
		this.location_name = location_name;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.start_time = start_time;

	}

}