import java.util.ArrayList;

class CopModel {

	public String organizer_description;
	public CreatorModel _creator;
	public String start_time;
	public ArrayList<SociallinksModel> sociallinks;
	public String organizer_name;
	public String name;
	public String end_time;
	public String topic;
	public String schedulepublished_on;
	public String location_name;
	public int tracks_ver;
	public String state;
	public String type;
	public String time_zone;
	public int speakers_ver;
	public String logo;
	public String description;
	public int id;
	public VersionModel _version;
	public int sponsors_ver;
	public String privacy;
	public String email;
	public AdeesModel _adees;

	public CopModel(String organizer_description, CreatorModel creator, String start_time, ArrayList<SociallinksModel> sociallinks, String organizer_name, String name, String end_time, String topic, String schedulepublished_on, String location_name, int tracks_ver, String state, String type, String time_zone, int speakers_ver, String logo, String description, int id, VersionModel version, int sponsors_ver, String privacy, String email, AdeesModel adees) {

		this.organizer_description = organizer_description;
		this._creator = creator;
		this.start_time = start_time;
		this.sociallinks = sociallinks;
		this.organizer_name = organizer_name;
		this.name = name;
		this.end_time = end_time;
		this.topic = topic;
		this.schedulepublished_on = schedulepublished_on;
		this.location_name = location_name;
		this.tracks_ver = tracks_ver;
		this.state = state;
		this.type = type;
		this.time_zone = time_zone;
		this.speakers_ver = speakers_ver;
		this.logo = logo;
		this.description = description;
		this.id = id;
		this._version = version;
		this.sponsors_ver = sponsors_ver;
		this.privacy = privacy;
		this.email = email;
		this._adees = adees;

	}

}