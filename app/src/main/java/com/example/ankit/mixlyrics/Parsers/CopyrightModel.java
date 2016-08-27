
class CopyrightModel {

	public String licence_url;
	public String licence;
	public String logo;
	public int year;
	public String holder;
	public String holder_url;

	public CopyrightModel(String licence_url, String licence, String logo, int year, String holder, String holder_url) {

		this.licence_url = licence_url;
		this.licence = licence;
		this.logo = logo;
		this.year = year;
		this.holder = holder;
		this.holder_url = holder_url;

	}

}