import java.util.ArrayList;

class CopModel {

    public String email;
    public String organizer_description;
    public VersionModel _version;
    public String topic;
    public String type;
    public ArrayList<Social_linksModel> social_links;
    public String start_time;
    public String location_name;
    public String state;
    public String name;
    public String logo;
    public String organizer_name;
    public int tracks_ver;
    public int sponsors_ver;
    public CreatorModel _creator;
    public String time_zone;
    public String end_time;
    public int id;
    public AdeesModel _adees;
    public String description;
    public int speakers_ver;
    public String schedule_published_on;
    public String privacy;

    public CopModel(String email, String organizer_description, VersionModel version, String topic, String type, ArrayList<Social_linksModel> social_links, String start_time, String location_name, String state, String name, String logo, String organizer_name, int tracks_ver, int sponsors_ver, CreatorModel creator, String time_zone, String end_time, int id, AdeesModel adees, String description, int speakers_ver, String schedule_published_on, String privacy) {

        this.email = email;
        this.organizer_description = organizer_description;
        this._version = version;
        this.topic = topic;
        this.type = type;
        this.social_links = social_links;
        this.start_time = start_time;
        this.location_name = location_name;
        this.state = state;
        this.name = name;
        this.logo = logo;
        this.organizer_name = organizer_name;
        this.tracks_ver = tracks_ver;
        this.sponsors_ver = sponsors_ver;
        this._creator = creator;
        this.time_zone = time_zone;
        this.end_time = end_time;
        this.id = id;
        this._adees = adees;
        this.description = description;
        this.speakers_ver = speakers_ver;
        this.schedule_published_on = schedule_published_on;
        this.privacy = privacy;

    }

}