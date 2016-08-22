
class VersionModel {

	public String licence_url;
	public String holder;
	public String licence;
	public int microlocations_ver;
	public int year;
	public int event_ver;
	public String logo;
	public int sessions_ver;
	public String holder_url;

	public VersionModel(String licence_url, String holder, String licence, int microlocations_ver, int year, int event_ver, String logo, int sessions_ver, String holder_url) {

		this.licence_url = licence_url;
		this.holder = holder;
		this.licence = licence;
		this.microlocations_ver = microlocations_ver;
		this.year = year;
		this.event_ver = event_ver;
		this.logo = logo;
		this.sessions_ver = sessions_ver;
		this.holder_url = holder_url;

	}

}