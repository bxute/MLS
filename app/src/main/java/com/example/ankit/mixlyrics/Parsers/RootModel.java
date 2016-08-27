import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String name;
	public String start_time;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String privacy;
	public String background_image;
	public String organizer_name;
	public String timezone;
	public String email;
	public String description;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String location_name;
	public String state;
	public int id;
	public VersionModel _version;
	public String topic;
	public String logo;

	public RootModel(String organizer_description, ArrayList<Social_linksModel> social_links, String type, String name, String start_time, String end_time, Call_for_papersModel call_for_papers, String schedule_published_on, CreatorModel creator, String privacy, String background_image, String organizer_name, String timezone, String email, String description, CopyrightModel copyright, String code_of_conduct, String location_name, String state, int id, VersionModel version, String topic, String logo) {

		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.type = type;
		this.name = name;
		this.start_time = start_time;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.privacy = privacy;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.email = email;
		this.description = description;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.state = state;
		this.id = id;
		this._version = version;
		this.topic = topic;
		this.logo = logo;

	}

}