import java.util.ArrayList;

class CopModel {

	public String state;
	public String logo;
	public int id;
	public String privacy;
	public String name;
	public VersionModel _version;
	public String type;
	public String email;
	public String description;
	public int tracks_ver;
	public String topic;
	public int sponsors_ver;
	public String end_time;
	public String organizer_name;
	public CreatorModel _creator;
	public AdeesModel _adees;
	public String organizer_description;
	public String schedule_published_on;
	public String time_zone;
	public int speakers_ver;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String location_name;

	public CopModel(String state, String logo, int id, String privacy, String name, VersionModel version, String type, String email, String description, int tracks_ver, String topic, int sponsors_ver, String end_time, String organizer_name, CreatorModel creator, AdeesModel adees, String organizer_description, String schedule_published_on, String time_zone, int speakers_ver, ArrayList<Social_linksModel> social_links, String start_time, String location_name) {

		this.state = state;
		this.logo = logo;
		this.id = id;
		this.privacy = privacy;
		this.name = name;
		this._version = version;
		this.type = type;
		this.email = email;
		this.description = description;
		this.tracks_ver = tracks_ver;
		this.topic = topic;
		this.sponsors_ver = sponsors_ver;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._adees = adees;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.time_zone = time_zone;
		this.speakers_ver = speakers_ver;
		this.social_links = social_links;
		this.start_time = start_time;
		this.location_name = location_name;

	}

}