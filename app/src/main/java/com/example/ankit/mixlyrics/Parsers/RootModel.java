import java.util.ArrayList;

class RootModel {

	public String state;
	public String background_image;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String privacy;
	public String description;
	public String organizer_description;
	public String code_of_conduct;
	public String name;
	public String logo;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String email;
	public VersionModel _version;
	public String type;
	public CopyrightModel _copyright;
	public String timezone;
	public String topic;
	public String start_time;
	public int id;
	public String schedule_published_on;

	public RootModel(String state, String background_image, String end_time, ArrayList<Social_linksModel> social_links, String organizer_name, String privacy, String description, String organizer_description, String code_of_conduct, String name, String logo, CreatorModel creator, Call_for_papersModel call_for_papers, String location_name, String email, VersionModel version, String type, CopyrightModel copyright, String timezone, String topic, String start_time, int id, String schedule_published_on) {

		this.state = state;
		this.background_image = background_image;
		this.end_time = end_time;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.description = description;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.logo = logo;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.email = email;
		this._version = version;
		this.type = type;
		this._copyright = copyright;
		this.timezone = timezone;
		this.topic = topic;
		this.start_time = start_time;
		this.id = id;
		this.schedule_published_on = schedule_published_on;

	}

}