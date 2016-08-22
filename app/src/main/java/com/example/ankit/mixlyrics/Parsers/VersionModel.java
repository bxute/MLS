
class VersionModel {

	public int sessions_ver;
	public String holder_url;
	public int event_ver;
	public String licence_url;
	public String logo;
	public int microlocations_ver;
	public int year;
	public String licence;
	public String holder;

	public VersionModel(int sessions_ver, String holder_url, int event_ver, String licence_url, String logo, int microlocations_ver, int year, String licence, String holder) {

		this.sessions_ver = sessions_ver;
		this.holder_url = holder_url;
		this.event_ver = event_ver;
		this.licence_url = licence_url;
		this.logo = logo;
		this.microlocations_ver = microlocations_ver;
		this.year = year;
		this.licence = licence;
		this.holder = holder;

	}

}