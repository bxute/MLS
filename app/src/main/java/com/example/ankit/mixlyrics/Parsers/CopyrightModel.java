
class CopyrightModel {

	public String licence_url;
	public String email;
	public String holder_url;
	public String holdon;
	public int year;
	public Callfor_papersModel _callfor_papers;
	public String licence;
	public String logo;
	public String endtime;
	public int extem;

	public CopyrightModel(String licence_url, String email, String holder_url, String holdon, int year, Callfor_papersModel callfor_papers, String licence, String logo, String endtime, int extem) {

		this.licence_url = licence_url;
		this.email = email;
		this.holder_url = holder_url;
		this.holdon = holdon;
		this.year = year;
		this._callfor_papers = callfor_papers;
		this.licence = licence;
		this.logo = logo;
		this.endtime = endtime;
		this.extem = extem;

	}

}