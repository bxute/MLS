
class VersionModel {

	public int sessions_ver;
	public String licence;
	public int year;
	public int event_ver;
	public String holder;
	public String holder_url;
	public String licence_url;
	public String logo;
	public int microlocations_ver;

	public VersionModel(int sessions_ver, String licence, int year, int event_ver, String holder, String holder_url, String licence_url, String logo, int microlocations_ver) {

		this.sessions_ver = sessions_ver;
		this.licence = licence;
		this.year = year;
		this.event_ver = event_ver;
		this.holder = holder;
		this.holder_url = holder_url;
		this.licence_url = licence_url;
		this.logo = logo;
		this.microlocations_ver = microlocations_ver;

	}

}