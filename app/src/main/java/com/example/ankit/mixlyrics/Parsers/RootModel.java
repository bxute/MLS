import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String name;
	public String logo;
	public String start_time;
	public String end_time;
	public String location_name;
	public String timezone;
	public String privacy;
	public String organizer_name;
	public int id;
	public CreatorModel _creator;
	public String description;
	public String organizer_description;
	public String background_image;
	public String code_of_conduct;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String topic;
	public String email;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String type;

	public RootModel(Call_for_papersModel call_for_papers, String name, String logo, String start_time, String end_time, String location_name, String timezone, String privacy, String organizer_name, int id, CreatorModel creator, String description, String organizer_description, String background_image, String code_of_conduct, String state, ArrayList<Social_linksModel> social_links, VersionModel version, String topic, String email, CopyrightModel copyright, String schedule_published_on, String type) {

		this._call_for_papers = call_for_papers;
		this.name = name;
		this.logo = logo;
		this.start_time = start_time;
		this.end_time = end_time;
		this.location_name = location_name;
		this.timezone = timezone;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.id = id;
		this._creator = creator;
		this.description = description;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.social_links = social_links;
		this._version = version;
		this.topic = topic;
		this.email = email;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.type = type;

	}

}