import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String background_image;
	public String topic;
	public String description;
	public VersionModel _version;
	public String logo;
	public String start_time;
	public String end_time;
	public String organizer_name;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public CreatorModel _creator;
	public String name;
	public String schedule_published_on;
	public int id;
	public String privacy;
	public String type;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String email;
	public String state;

	public RootModel(String timezone, String background_image, String topic, String description, VersionModel version, String logo, String start_time, String end_time, String organizer_name, String code_of_conduct, ArrayList<Social_linksModel> social_links, String location_name, CreatorModel creator, String name, String schedule_published_on, int id, String privacy, String type, String organizer_description, Call_for_papersModel call_for_papers, CopyrightModel copyright, String email, String state) {

		this.timezone = timezone;
		this.background_image = background_image;
		this.topic = topic;
		this.description = description;
		this._version = version;
		this.logo = logo;
		this.start_time = start_time;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.location_name = location_name;
		this._creator = creator;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.privacy = privacy;
		this.type = type;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.email = email;
		this.state = state;

	}

}