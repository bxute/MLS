import java.util.ArrayList;

class CopModel {

	public int sponsors_ver;
	public CreatorModel _creator;
	public String topic;
	public String location_name;
	public String type;
	public VersionModel _version;
	public String privacy;
	public int id;
	public String schedulepublished_on;
	public String start_time;
	public String end_time;
	public int speakers_ver;
	public String email;
	public String organizer_description;
	public String time_zone;
	public String description;
	public ArrayList<SociallinksModel> sociallinks;
	public String organizer_name;
	public String state;
	public AdeesModel _adees;
	public String logo;
	public String name;
	public int tracks_ver;

	public CopModel(int sponsors_ver, CreatorModel creator, String topic, String location_name, String type, VersionModel version, String privacy, int id, String schedulepublished_on, String start_time, String end_time, int speakers_ver, String email, String organizer_description, String time_zone, String description, ArrayList<SociallinksModel> sociallinks, String organizer_name, String state, AdeesModel adees, String logo, String name, int tracks_ver) {

		this.sponsors_ver = sponsors_ver;
		this._creator = creator;
		this.topic = topic;
		this.location_name = location_name;
		this.type = type;
		this._version = version;
		this.privacy = privacy;
		this.id = id;
		this.schedulepublished_on = schedulepublished_on;
		this.start_time = start_time;
		this.end_time = end_time;
		this.speakers_ver = speakers_ver;
		this.email = email;
		this.organizer_description = organizer_description;
		this.time_zone = time_zone;
		this.description = description;
		this.sociallinks = sociallinks;
		this.organizer_name = organizer_name;
		this.state = state;
		this._adees = adees;
		this.logo = logo;
		this.name = name;
		this.tracks_ver = tracks_ver;

	}

}