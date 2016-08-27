import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String end_time;
	public String privacy;
	public String topic;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String organizer_name;
	public String start_time;
	public String description;
	public CreatorModel _creator;
	public String location_name;
	public String organizer_description;
	public String logo;
	public String background_image;
	public String name;
	public String email;
	public String schedule_published_on;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String type;

	public RootModel(VersionModel version, Call_for_papersModel call_for_papers, String timezone, String end_time, String privacy, String topic, int id, ArrayList<Social_linksModel> social_links, String state, String organizer_name, String start_time, String description, CreatorModel creator, String location_name, String organizer_description, String logo, String background_image, String name, String email, String schedule_published_on, String code_of_conduct, CopyrightModel copyright, String type) {

		this._version = version;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.end_time = end_time;
		this.privacy = privacy;
		this.topic = topic;
		this.id = id;
		this.social_links = social_links;
		this.state = state;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.description = description;
		this._creator = creator;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.background_image = background_image;
		this.name = name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.type = type;

	}

}