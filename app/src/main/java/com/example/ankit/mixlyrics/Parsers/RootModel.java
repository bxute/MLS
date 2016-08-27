import java.util.ArrayList;

class RootModel {

	public String end_time;
	public VersionModel _version;
	public int id;
	public String topic;
	public String timezone;
	public CreatorModel _creator;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String location_name;
	public String name;
	public String schedule_published_on;
	public String organizer_name;
	public String background_image;
	public String start_time;
	public String email;
	public String state;
	public String code_of_conduct;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String privacy;

	public RootModel(String end_time, VersionModel version, int id, String topic, String timezone, CreatorModel creator, String organizer_description, CopyrightModel copyright, String description, ArrayList<Social_linksModel> social_links, String logo, String location_name, String name, String schedule_published_on, String organizer_name, String background_image, String start_time, String email, String state, String code_of_conduct, String type, Call_for_papersModel call_for_papers, String privacy) {

		this.end_time = end_time;
		this._version = version;
		this.id = id;
		this.topic = topic;
		this.timezone = timezone;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.description = description;
		this.social_links = social_links;
		this.logo = logo;
		this.location_name = location_name;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.start_time = start_time;
		this.email = email;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;

	}

}