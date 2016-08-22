
class CopyrightModel {

	public String holder_url;
	public String licence;
	public int year;
	public Call_for_papersModel _call_for_papers;
	public String holdon;
	public String licence_url;
	public String email;
	public String logo;
	public int e;
	public String endtime;

	public CopyrightModel(String holder_url, String licence, int year, Call_for_papersModel call_for_papers, String holdon, String licence_url, String email, String logo, int e, String endtime) {

		this.holder_url = holder_url;
		this.licence = licence;
		this.year = year;
		this._call_for_papers = call_for_papers;
		this.holdon = holdon;
		this.licence_url = licence_url;
		this.email = email;
		this.logo = logo;
		this.e = e;
		this.endtime = endtime;

	}

}