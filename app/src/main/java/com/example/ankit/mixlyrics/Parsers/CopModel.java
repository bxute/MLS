import java.util.ArrayList;

class CopModel {

	public String type;
	public AdeesModel _adees;
	public String name;
	public VersionModel _version;
	public int tracks_ver;
	public int sponsors_ver;
	public int id;
	public String organizer_name;
	public String logo;
	public String time_zone;
	public String privacy;
	public String schedulepublished_on;
	public String topic;
	public String location_name;
	public String description;
	public ArrayList<SociallinksModel> sociallinks;
	public String email;
	public String start_time;
	public String organizer_description;
	public CreatorModel _creator;
	public String end_time;
	public String state;
	public int speakers_ver;

	public CopModel(String type, AdeesModel adees, String name, VersionModel version, int tracks_ver, int sponsors_ver, int id, String organizer_name, String logo, String time_zone, String privacy, String schedulepublished_on, String topic, String location_name, String description, ArrayList<SociallinksModel> sociallinks, String email, String start_time, String organizer_description, CreatorModel creator, String end_time, String state, int speakers_ver) {

		this.type = type;
		this._adees = adees;
		this.name = name;
		this._version = version;
		this.tracks_ver = tracks_ver;
		this.sponsors_ver = sponsors_ver;
		this.id = id;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.time_zone = time_zone;
		this.privacy = privacy;
		this.schedulepublished_on = schedulepublished_on;
		this.topic = topic;
		this.location_name = location_name;
		this.description = description;
		this.sociallinks = sociallinks;
		this.email = email;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.end_time = end_time;
		this.state = state;
		this.speakers_ver = speakers_ver;

	}

}