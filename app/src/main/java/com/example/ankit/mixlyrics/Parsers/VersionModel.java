
class VersionModel {

	public int microlocations_ver;
	public int sessions_ver;
	public int event_ver;
	public String licence_url;
	public String logo;
	public String licence;
	public int year;
	public String holder;
	public String holder_url;

	public VersionModel(int microlocations_ver, int sessions_ver, int event_ver, String licence_url, String logo, String licence, int year, String holder, String holder_url) {

		this.microlocations_ver = microlocations_ver;
		this.sessions_ver = sessions_ver;
		this.event_ver = event_ver;
		this.licence_url = licence_url;
		this.logo = logo;
		this.licence = licence;
		this.year = year;
		this.holder = holder;
		this.holder_url = holder_url;

	}

}