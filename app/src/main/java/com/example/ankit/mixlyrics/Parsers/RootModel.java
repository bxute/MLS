import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String end_time;
	public int id;
	public String schedule_published_on;
	public String background_image;
	public CreatorModel _creator;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String logo;
	public VersionModel _version;
	public String timezone;
	public String description;
	public String organizer_description;
	public String organizer_name;
	public String code_of_conduct;
	public String type;
	public String name;
	public String topic;
	public String location_name;
	public String privacy;
	public String email;

	public RootModel(ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String end_time, int id, String schedule_published_on, String background_image, CreatorModel creator, String state, Call_for_papersModel call_for_papers, String start_time, String logo, VersionModel version, String timezone, String description, String organizer_description, String organizer_name, String code_of_conduct, String type, String name, String topic, String location_name, String privacy, String email) {

		this.social_links = social_links;
		this._copyright = copyright;
		this.end_time = end_time;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this._creator = creator;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.logo = logo;
		this._version = version;
		this.timezone = timezone;
		this.description = description;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.name = name;
		this.topic = topic;
		this.location_name = location_name;
		this.privacy = privacy;
		this.email = email;

	}

}