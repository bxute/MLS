import java.util.ArrayList;

class RootModel {

	public String privacy;
	public VersionModel _version;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String name;
	public String code_of_conduct;
	public String location_name;
	public String type;
	public int id;
	public String organizer_description;
	public String email;
	public String description;
	public String timezone;
	public String end_time;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_name;
	public CreatorModel _creator;
	public String background_image;
	public String topic;
	public String state;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String privacy, VersionModel version, String start_time, Call_for_papersModel call_for_papers, String logo, String name, String code_of_conduct, String location_name, String type, int id, String organizer_description, String email, String description, String timezone, String end_time, CopyrightModel copyright, String schedule_published_on, String organizer_name, CreatorModel creator, String background_image, String topic, String state, ArrayList<Social_linksModel> social_links) {

		this.privacy = privacy;
		this._version = version;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.type = type;
		this.id = id;
		this.organizer_description = organizer_description;
		this.email = email;
		this.description = description;
		this.timezone = timezone;
		this.end_time = end_time;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.background_image = background_image;
		this.topic = topic;
		this.state = state;
		this.social_links = social_links;

	}

}