import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String state;
	public String name;
	public String logo;
	public String topic;
	public String description;
	public String type;
	public CopyrightModel _copyright;
	public String start_time;
	public String timezone;
	public String end_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public VersionModel _version;
	public String schedule_published_on;
	public String privacy;
	public String organizer_name;
	public String organizer_description;
	public String email;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;

	public RootModel(CreatorModel creator, String state, String name, String logo, String topic, String description, String type, CopyrightModel copyright, String start_time, String timezone, String end_time, int id, ArrayList<Social_linksModel> social_links, String code_of_conduct, VersionModel version, String schedule_published_on, String privacy, String organizer_name, String organizer_description, String email, String location_name, Call_for_papersModel call_for_papers, String background_image) {

		this._creator = creator;
		this.state = state;
		this.name = name;
		this.logo = logo;
		this.topic = topic;
		this.description = description;
		this.type = type;
		this._copyright = copyright;
		this.start_time = start_time;
		this.timezone = timezone;
		this.end_time = end_time;
		this.id = id;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.email = email;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;

	}

}