import java.util.ArrayList;

class RootModel {

	public String state;
	public CopyrightModel _copyright;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public VersionModel _version;
	public CreatorModel _creator;
	public String organizer_description;
	public String end_time;
	public String description;
	public int id;
	public String start_time;
	public String code_of_conduct;
	public String topic;
	public String timezone;
	public String email;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String name;
	public String logo;
	public String schedule_published_on;
	public String privacy;

	public RootModel(String state, CopyrightModel copyright, String background_image, Call_for_papersModel call_for_papers, String organizer_name, VersionModel version, CreatorModel creator, String organizer_description, String end_time, String description, int id, String start_time, String code_of_conduct, String topic, String timezone, String email, String location_name, ArrayList<Social_linksModel> social_links, String type, String name, String logo, String schedule_published_on, String privacy) {

		this.state = state;
		this._copyright = copyright;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this._version = version;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.description = description;
		this.id = id;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.timezone = timezone;
		this.email = email;
		this.location_name = location_name;
		this.social_links = social_links;
		this.type = type;
		this.name = name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;

	}

}