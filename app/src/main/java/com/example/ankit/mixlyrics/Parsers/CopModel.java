import java.util.ArrayList;

class CopModel {

	public int id;
	public String end_time;
	public AdeesModel _adees;
	public String time_zone;
	public CreatorModel _creator;
	public String location_name;
	public String logo;
	public int sponsors_ver;
	public String privacy;
	public String state;
	public int tracks_ver;
	public String type;
	public String email;
	public int speakers_ver;
	public String organizer_name;
	public ArrayList<SociallinksModel> sociallinks;
	public VersionModel _version;
	public String description;
	public String name;
	public String organizer_description;
	public String start_time;
	public String topic;
	public String schedulepublished_on;

	public CopModel(int id, String end_time, AdeesModel adees, String time_zone, CreatorModel creator, String location_name, String logo, int sponsors_ver, String privacy, String state, int tracks_ver, String type, String email, int speakers_ver, String organizer_name, ArrayList<SociallinksModel> sociallinks, VersionModel version, String description, String name, String organizer_description, String start_time, String topic, String schedulepublished_on) {

		this.id = id;
		this.end_time = end_time;
		this._adees = adees;
		this.time_zone = time_zone;
		this._creator = creator;
		this.location_name = location_name;
		this.logo = logo;
		this.sponsors_ver = sponsors_ver;
		this.privacy = privacy;
		this.state = state;
		this.tracks_ver = tracks_ver;
		this.type = type;
		this.email = email;
		this.speakers_ver = speakers_ver;
		this.organizer_name = organizer_name;
		this.sociallinks = sociallinks;
		this._version = version;
		this.description = description;
		this.name = name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.topic = topic;
		this.schedulepublished_on = schedulepublished_on;

	}

}