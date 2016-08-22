import java.util.ArrayList;

class CopModel {

	public String state;
	public VersionModel _version;
	public String start_time;
	public String time_zone;
	public String organizer_description;
	public int speakers_ver;
	public String description;
	public CreatorModel _creator;
	public String topic;
	public int tracks_ver;
	public String privacy;
	public int sponsors_ver;
	public String logo;
	public String organizer_name;
	public int id;
	public String schedule_published_on;
	public AdeesModel _adees;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String type;
	public String name;
	public String end_time;

	public CopModel(String state, VersionModel version, String start_time, String time_zone, String organizer_description, int speakers_ver, String description, CreatorModel creator, String topic, int tracks_ver, String privacy, int sponsors_ver, String logo, String organizer_name, int id, String schedule_published_on, AdeesModel adees, String location_name, ArrayList<Social_linksModel> social_links, String email, String type, String name, String end_time) {

		this.state = state;
		this._version = version;
		this.start_time = start_time;
		this.time_zone = time_zone;
		this.organizer_description = organizer_description;
		this.speakers_ver = speakers_ver;
		this.description = description;
		this._creator = creator;
		this.topic = topic;
		this.tracks_ver = tracks_ver;
		this.privacy = privacy;
		this.sponsors_ver = sponsors_ver;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this._adees = adees;
		this.location_name = location_name;
		this.social_links = social_links;
		this.email = email;
		this.type = type;
		this.name = name;
		this.end_time = end_time;

	}

}