
class CopyrightModel {

	public String holder_url;
	public int year;
	public String licence_url;
	public String licence;
	public String holder;
	public String logo;

	public CopyrightModel(String holder_url, int year, String licence_url, String licence, String holder, String logo) {

		this.holder_url = holder_url;
		this.year = year;
		this.licence_url = licence_url;
		this.licence = licence;
		this.holder = holder;
		this.logo = logo;

	}

}