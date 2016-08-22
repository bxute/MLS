
class VersionModel {

	public int event_ver;
	public String holder;
	public String licence_url;
	public int microlocations_ver;
	public String licence;
	public String holder_url;
	public int year;
	public String logo;
	public int sessions_ver;

	public VersionModel(int event_ver, String holder, String licence_url, int microlocations_ver, String licence, String holder_url, int year, String logo, int sessions_ver) {

		this.event_ver = event_ver;
		this.holder = holder;
		this.licence_url = licence_url;
		this.microlocations_ver = microlocations_ver;
		this.licence = licence;
		this.holder_url = holder_url;
		this.year = year;
		this.logo = logo;
		this.sessions_ver = sessions_ver;

	}

}