import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String state;
	public String end_time;
	public String type;
	public String timezone;
	public String privacy;
	public String description;
	public String email;
	public String background_image;
	public String organizer_description;
	public String topic;
	public CopyrightModel _copyright;
	public String logo;
	public VersionModel _version;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String schedule_published_on;
	public String code_of_conduct;
	public String organizer_name;
	public String location_name;
	public CreatorModel _creator;
	public String name;

	public RootModel(Call_for_papersModel call_for_papers, String state, String end_time, String type, String timezone, String privacy, String description, String email, String background_image, String organizer_description, String topic, CopyrightModel copyright, String logo, VersionModel version, int id, ArrayList<Social_linksModel> social_links, String start_time, String schedule_published_on, String code_of_conduct, String organizer_name, String location_name, CreatorModel creator, String name) {

		this._call_for_papers = call_for_papers;
		this.state = state;
		this.end_time = end_time;
		this.type = type;
		this.timezone = timezone;
		this.privacy = privacy;
		this.description = description;
		this.email = email;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this._copyright = copyright;
		this.logo = logo;
		this._version = version;
		this.id = id;
		this.social_links = social_links;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._creator = creator;
		this.name = name;

	}

}