
class VersionModel {

	public String startdate;
	public String privacy;
	public String end_date;
	public String timezone;
	public int tracks_ver;
	public int eventver;

	public VersionModel(String startdate, String privacy, String end_date, String timezone, int tracks_ver, int eventver) {

		this.startdate = startdate;
		this.privacy = privacy;
		this.end_date = end_date;
		this.timezone = timezone;
		this.tracks_ver = tracks_ver;
		this.eventver = eventver;

	}

}