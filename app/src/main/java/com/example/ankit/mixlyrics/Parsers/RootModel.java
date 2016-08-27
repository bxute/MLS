import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String topic;
	public String organizer_name;
	public String timezone;
	public String schedule_published_on;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public int id;
	public String type;
	public String location_name;
	public CopyrightModel _copyright;
	public String start_time;
	public String name;
	public String organizer_description;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String code_of_conduct;
	public String description;
	public String end_time;
	public String privacy;
	public String state;

	public RootModel(CreatorModel creator, String topic, String organizer_name, String timezone, String schedule_published_on, String background_image, Call_for_papersModel call_for_papers, String logo, int id, String type, String location_name, CopyrightModel copyright, String start_time, String name, String organizer_description, VersionModel version, ArrayList<Social_linksModel> social_links, String email, String code_of_conduct, String description, String end_time, String privacy, String state) {

		this._creator = creator;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.id = id;
		this.type = type;
		this.location_name = location_name;
		this._copyright = copyright;
		this.start_time = start_time;
		this.name = name;
		this.organizer_description = organizer_description;
		this._version = version;
		this.social_links = social_links;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.state = state;

	}

}