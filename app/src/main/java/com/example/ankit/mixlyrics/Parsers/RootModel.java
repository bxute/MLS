import java.util.ArrayList;

class RootModel {

	public String state;
	public String code_of_conduct;
	public String background_image;
	public int id;
	public String email;
	public String description;
	public String privacy;
	public String location_name;
	public String name;
	public String organizer_description;
	public CreatorModel _creator;
	public String topic;
	public String schedule_published_on;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String end_time;
	public VersionModel _version;
	public String type;
	public String start_time;
	public String timezone;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String state, String code_of_conduct, String background_image, int id, String email, String description, String privacy, String location_name, String name, String organizer_description, CreatorModel creator, String topic, String schedule_published_on, String organizer_name, CopyrightModel copyright, String end_time, VersionModel version, String type, String start_time, String timezone, String logo, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links) {

		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.id = id;
		this.email = email;
		this.description = description;
		this.privacy = privacy;
		this.location_name = location_name;
		this.name = name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.end_time = end_time;
		this._version = version;
		this.type = type;
		this.start_time = start_time;
		this.timezone = timezone;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;

	}

}