
class VersionModel {

	public String licence;
	public int year;
	public String licence_url;
	public int sessions_ver;
	public String holder;
	public int event_ver;
	public String logo;
	public int microlocations_ver;
	public String holder_url;

	public VersionModel(String licence, int year, String licence_url, int sessions_ver, String holder, int event_ver, String logo, int microlocations_ver, String holder_url) {

		this.licence = licence;
		this.year = year;
		this.licence_url = licence_url;
		this.sessions_ver = sessions_ver;
		this.holder = holder;
		this.event_ver = event_ver;
		this.logo = logo;
		this.microlocations_ver = microlocations_ver;
		this.holder_url = holder_url;

	}

}