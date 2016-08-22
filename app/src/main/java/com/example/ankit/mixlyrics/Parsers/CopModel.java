import java.util.ArrayList;

class CopModel {

	public String type;
	public String end_time;
	public String topic;
	public String email;
	public String schedulepublished_on;
	public String organizer_description;
	public int speakers_ver;
	public String privacy;
	public String location_name;
	public String state;
	public VersionModel _version;
	public int id;
	public String organizer_name;
	public String name;
	public String description;
	public int tracks_ver;
	public CreatorModel _creator;
	public String time_zone;
	public ArrayList<SociallinksModel> sociallinks;
	public AdeesModel _adees;
	public String start_time;
	public String logo;
	public int sponsors_ver;

	public CopModel(String type, String end_time, String topic, String email, String schedulepublished_on, String organizer_description, int speakers_ver, String privacy, String location_name, String state, VersionModel version, int id, String organizer_name, String name, String description, int tracks_ver, CreatorModel creator, String time_zone, ArrayList<SociallinksModel> sociallinks, AdeesModel adees, String start_time, String logo, int sponsors_ver) {

		this.type = type;
		this.end_time = end_time;
		this.topic = topic;
		this.email = email;
		this.schedulepublished_on = schedulepublished_on;
		this.organizer_description = organizer_description;
		this.speakers_ver = speakers_ver;
		this.privacy = privacy;
		this.location_name = location_name;
		this.state = state;
		this._version = version;
		this.id = id;
		this.organizer_name = organizer_name;
		this.name = name;
		this.description = description;
		this.tracks_ver = tracks_ver;
		this._creator = creator;
		this.time_zone = time_zone;
		this.sociallinks = sociallinks;
		this._adees = adees;
		this.start_time = start_time;
		this.logo = logo;
		this.sponsors_ver = sponsors_ver;

	}

}