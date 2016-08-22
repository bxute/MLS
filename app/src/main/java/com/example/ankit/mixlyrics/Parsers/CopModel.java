import java.util.ArrayList;

class CopModel {

	public String description;
	public String organizer_description;
	public int tracks_ver;
	public String email;
	public String schedule_published_on;
	public AdeesModel _adees;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public CreatorModel _creator;
	public String start_time;
	public int sponsors_ver;
	public String state;
	public String privacy;
	public String location_name;
	public String time_zone;
	public String type;
	public String end_time;
	public String topic;
	public int speakers_ver;
	public int id;
	public VersionModel _version;
	public String name;

	public CopModel(String description, String organizer_description, int tracks_ver, String email, String schedule_published_on, AdeesModel adees, String organizer_name, ArrayList<Social_linksModel> social_links, String logo, CreatorModel creator, String start_time, int sponsors_ver, String state, String privacy, String location_name, String time_zone, String type, String end_time, String topic, int speakers_ver, int id, VersionModel version, String name) {

		this.description = description;
		this.organizer_description = organizer_description;
		this.tracks_ver = tracks_ver;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._adees = adees;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.logo = logo;
		this._creator = creator;
		this.start_time = start_time;
		this.sponsors_ver = sponsors_ver;
		this.state = state;
		this.privacy = privacy;
		this.location_name = location_name;
		this.time_zone = time_zone;
		this.type = type;
		this.end_time = end_time;
		this.topic = topic;
		this.speakers_ver = speakers_ver;
		this.id = id;
		this._version = version;
		this.name = name;

	}

}