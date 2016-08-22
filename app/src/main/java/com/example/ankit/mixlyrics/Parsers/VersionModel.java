
class VersionModel {

	public String holder_url;
	public String holder;
	public String licence_url;
	public int event_ver;
	public int sessions_ver;
	public int microlocations_ver;
	public String logo;
	public int year;
	public String licence;

	public VersionModel(String holder_url, String holder, String licence_url, int event_ver, int sessions_ver, int microlocations_ver, String logo, int year, String licence) {

		this.holder_url = holder_url;
		this.holder = holder;
		this.licence_url = licence_url;
		this.event_ver = event_ver;
		this.sessions_ver = sessions_ver;
		this.microlocations_ver = microlocations_ver;
		this.logo = logo;
		this.year = year;
		this.licence = licence;

	}

}