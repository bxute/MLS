import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String organizer_description;
	public String email;
	public String type;
	public String name;
	public String description;
	public String state;
	public String code_of_conduct;
	public String logo;
	public String start_time;
	public String end_time;
	public String timezone;
	public String privacy;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String location_name;
	public int id;
	public CreatorModel _creator;
	public String background_image;
	public CopyrightModel _copyright;
	public String organizer_name;

	public RootModel(Call_for_papersModel call_for_papers, String schedule_published_on, String organizer_description, String email, String type, String name, String description, String state, String code_of_conduct, String logo, String start_time, String end_time, String timezone, String privacy, VersionModel version, ArrayList<Social_linksModel> social_links, String topic, String location_name, int id, CreatorModel creator, String background_image, CopyrightModel copyright, String organizer_name) {

		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.email = email;
		this.type = type;
		this.name = name;
		this.description = description;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.start_time = start_time;
		this.end_time = end_time;
		this.timezone = timezone;
		this.privacy = privacy;
		this._version = version;
		this.social_links = social_links;
		this.topic = topic;
		this.location_name = location_name;
		this.id = id;
		this._creator = creator;
		this.background_image = background_image;
		this._copyright = copyright;
		this.organizer_name = organizer_name;

	}

}