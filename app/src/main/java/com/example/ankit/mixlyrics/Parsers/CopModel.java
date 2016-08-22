import java.util.ArrayList;

class CopModel {

	public String state;
	public String privacy;
	public String time_zone;
	public String type;
	public String end_time;
	public int sponsors_ver;
	public AdeesModel _adees;
	public String logo;
	public String description;
	public VersionModel _version;
	public String start_time;
	public String organizer_name;
	public String schedulepublished_on;
	public String location_name;
	public ArrayList<SociallinksModel> sociallinks;
	public String name;
	public String email;
	public int speakers_ver;
	public String topic;
	public String organizer_description;
	public CreatorModel _creator;
	public int id;
	public int tracks_ver;

	public CopModel(String state, String privacy, String time_zone, String type, String end_time, int sponsors_ver, AdeesModel adees, String logo, String description, VersionModel version, String start_time, String organizer_name, String schedulepublished_on, String location_name, ArrayList<SociallinksModel> sociallinks, String name, String email, int speakers_ver, String topic, String organizer_description, CreatorModel creator, int id, int tracks_ver) {

		this.state = state;
		this.privacy = privacy;
		this.time_zone = time_zone;
		this.type = type;
		this.end_time = end_time;
		this.sponsors_ver = sponsors_ver;
		this._adees = adees;
		this.logo = logo;
		this.description = description;
		this._version = version;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.schedulepublished_on = schedulepublished_on;
		this.location_name = location_name;
		this.sociallinks = sociallinks;
		this.name = name;
		this.email = email;
		this.speakers_ver = speakers_ver;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.id = id;
		this.tracks_ver = tracks_ver;

	}

}