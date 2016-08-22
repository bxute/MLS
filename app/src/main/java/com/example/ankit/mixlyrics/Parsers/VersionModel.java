
class VersionModel {

	public String logo;
	public String holder_url;
	public int microlocations_ver;
	public String licence_url;
	public String licence;
	public String holder;
	public int year;
	public int event_ver;
	public int sessions_ver;

	public VersionModel(String logo, String holder_url, int microlocations_ver, String licence_url, String licence, String holder, int year, int event_ver, int sessions_ver) {

		this.logo = logo;
		this.holder_url = holder_url;
		this.microlocations_ver = microlocations_ver;
		this.licence_url = licence_url;
		this.licence = licence;
		this.holder = holder;
		this.year = year;
		this.event_ver = event_ver;
		this.sessions_ver = sessions_ver;

	}

}