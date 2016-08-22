
class VersionModel {

	public String holder;
	public String licence;
	public int event_ver;
	public int year;
	public String logo;
	public int sessions_ver;
	public String holder_url;
	public int microlocations_ver;
	public String licence_url;

	public VersionModel(String holder, String licence, int event_ver, int year, String logo, int sessions_ver, String holder_url, int microlocations_ver, String licence_url) {

		this.holder = holder;
		this.licence = licence;
		this.event_ver = event_ver;
		this.year = year;
		this.logo = logo;
		this.sessions_ver = sessions_ver;
		this.holder_url = holder_url;
		this.microlocations_ver = microlocations_ver;
		this.licence_url = licence_url;

	}

}