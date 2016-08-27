import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String state;
	public String end_time;
	public String description;
	public String timezone;
	public String topic;
	public String email;
	public String organizer_name;
	public String name;
	public String privacy;
	public String background_image;
	public String start_time;
	public String code_of_conduct;
	public String type;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public int id;
	public CopyrightModel _copyright;
	public String logo;

	public RootModel(String organizer_description, String state, String end_time, String description, String timezone, String topic, String email, String organizer_name, String name, String privacy, String background_image, String start_time, String code_of_conduct, String type, String schedule_published_on, ArrayList<Social_linksModel> social_links, VersionModel version, CreatorModel creator, Call_for_papersModel call_for_papers, String location_name, int id, CopyrightModel copyright, String logo) {

		this.organizer_description = organizer_description;
		this.state = state;
		this.end_time = end_time;
		this.description = description;
		this.timezone = timezone;
		this.topic = topic;
		this.email = email;
		this.organizer_name = organizer_name;
		this.name = name;
		this.privacy = privacy;
		this.background_image = background_image;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._version = version;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.id = id;
		this._copyright = copyright;
		this.logo = logo;

	}

}