import java.util.ArrayList;

class RootModel {

	public int id;
	public String state;
	public String end_time;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String topic;
	public String email;
	public String location_name;
	public String description;
	public String organizer_description;
	public String code_of_conduct;
	public VersionModel _version;
	public String name;
	public String start_time;
	public String timezone;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String logo;
	public String organizer_name;
	public String type;
	public String privacy;

	public RootModel(int id, String state, String end_time, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String background_image, String topic, String email, String location_name, String description, String organizer_description, String code_of_conduct, VersionModel version, String name, String start_time, String timezone, CreatorModel creator, String schedule_published_on, String logo, String organizer_name, String type, String privacy) {

		this.id = id;
		this.state = state;
		this.end_time = end_time;
		this._copyright = copyright;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.topic = topic;
		this.email = email;
		this.location_name = location_name;
		this.description = description;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.name = name;
		this.start_time = start_time;
		this.timezone = timezone;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.type = type;
		this.privacy = privacy;

	}

}