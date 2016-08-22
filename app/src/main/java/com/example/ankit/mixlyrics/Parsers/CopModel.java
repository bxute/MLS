import java.util.ArrayList;

class CopModel {

	public String location_name;
	public String start_time;
	public String state;
	public String schedulepublished_on;
	public String name;
	public int tracks_ver;
	public int speakers_ver;
	public VersionModel _version;
	public AdeesModel _adees;
	public String logo;
	public CreatorModel _creator;
	public String organizer_name;
	public ArrayList<SociallinksModel> sociallinks;
	public int sponsors_ver;
	public String type;
	public String organizer_description;
	public String time_zone;
	public String email;
	public int id;
	public String privacy;
	public String description;
	public String end_time;
	public String topic;

	public CopModel(String location_name, String start_time, String state, String schedulepublished_on, String name, int tracks_ver, int speakers_ver, VersionModel version, AdeesModel adees, String logo, CreatorModel creator, String organizer_name, ArrayList<SociallinksModel> sociallinks, int sponsors_ver, String type, String organizer_description, String time_zone, String email, int id, String privacy, String description, String end_time, String topic) {

		this.location_name = location_name;
		this.start_time = start_time;
		this.state = state;
		this.schedulepublished_on = schedulepublished_on;
		this.name = name;
		this.tracks_ver = tracks_ver;
		this.speakers_ver = speakers_ver;
		this._version = version;
		this._adees = adees;
		this.logo = logo;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.sociallinks = sociallinks;
		this.sponsors_ver = sponsors_ver;
		this.type = type;
		this.organizer_description = organizer_description;
		this.time_zone = time_zone;
		this.email = email;
		this.id = id;
		this.privacy = privacy;
		this.description = description;
		this.end_time = end_time;
		this.topic = topic;

	}

}