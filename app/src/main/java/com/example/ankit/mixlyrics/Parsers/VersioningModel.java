
class VersioningModel {

	public int eventver;
	public String startdate;
	public int tracks_ver;
	public String end_date;
	public String privacy;
	public String timezone;

	public VersioningModel(int eventver, String startdate, int tracks_ver, String end_date, String privacy, String timezone) {

		this.eventver = eventver;
		this.startdate = startdate;
		this.tracks_ver = tracks_ver;
		this.end_date = end_date;
		this.privacy = privacy;
		this.timezone = timezone;

	}

}