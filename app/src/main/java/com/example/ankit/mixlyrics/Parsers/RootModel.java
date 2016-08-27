import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String type;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public VersionModel _version;
	public String end_time;
	public String code_of_conduct;
	public String logo;
	public String start_time;
	public String timezone;
	public int id;
	public String topic;
	public String organizer_description;
	public String location_name;
	public String organizer_name;
	public String background_image;
	public String email;
	public String state;

	public RootModel(CopyrightModel copyright, String type, String name, Call_for_papersModel call_for_papers, String privacy, String description, CreatorModel creator, ArrayList<Social_linksModel> social_links, String schedule_published_on, VersionModel version, String end_time, String code_of_conduct, String logo, String start_time, String timezone, int id, String topic, String organizer_description, String location_name, String organizer_name, String background_image, String email, String state) {

		this._copyright = copyright;
		this.type = type;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.description = description;
		this._creator = creator;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.start_time = start_time;
		this.timezone = timezone;
		this.id = id;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.email = email;
		this.state = state;

	}

}