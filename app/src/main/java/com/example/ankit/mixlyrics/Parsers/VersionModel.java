
class VersionModel {

	public String end_date;
	public String privacy;
	public int eventver;
	public int tracks_ver;
	public String timezone;
	public String startdate;

	public VersionModel(String end_date, String privacy, int eventver, int tracks_ver, String timezone, String startdate) {

		this.end_date = end_date;
		this.privacy = privacy;
		this.eventver = eventver;
		this.tracks_ver = tracks_ver;
		this.timezone = timezone;
		this.startdate = startdate;

	}

}