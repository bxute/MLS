import java.util.ArrayList;

class CopModel {

	public String topic;
	public int id;
	public String start_time;
	public String organizer_description;
	public String logo;
	public String name;
	public int tracks_ver;
	public int speakers_ver;
	public String type;
	public String state;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String email;
	public String time_zone;
	public int sponsors_ver;
	public String privacy;
	public VersionModel _version;
	public String organizer_name;
	public AdeesModel _adees;
	public String end_time;
	public String location_name;
	public CreatorModel _creator;

	public CopModel(String topic, int id, String start_time, String organizer_description, String logo, String name, int tracks_ver, int speakers_ver, String type, String state, String description, ArrayList<Social_linksModel> social_links, String schedule_published_on, String email, String time_zone, int sponsors_ver, String privacy, VersionModel version, String organizer_name, AdeesModel adees, String end_time, String location_name, CreatorModel creator) {

		this.topic = topic;
		this.id = id;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.name = name;
		this.tracks_ver = tracks_ver;
		this.speakers_ver = speakers_ver;
		this.type = type;
		this.state = state;
		this.description = description;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.time_zone = time_zone;
		this.sponsors_ver = sponsors_ver;
		this.privacy = privacy;
		this._version = version;
		this.organizer_name = organizer_name;
		this._adees = adees;
		this.end_time = end_time;
		this.location_name = location_name;
		this._creator = creator;

	}

}