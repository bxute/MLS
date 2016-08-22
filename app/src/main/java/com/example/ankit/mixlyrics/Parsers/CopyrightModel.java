
class CopyrightModel {

	public String endtime;
	public String holder_url;
	public int extem;
	public String licence_url;
	public String licence;
	public String logo;
	public String email;
	public int year;
	public Callfor_papersModel _callfor_papers;
	public String holdon;

	public CopyrightModel(String endtime, String holder_url, int extem, String licence_url, String licence, String logo, String email, int year, Callfor_papersModel callfor_papers, String holdon) {

		this.endtime = endtime;
		this.holder_url = holder_url;
		this.extem = extem;
		this.licence_url = licence_url;
		this.licence = licence;
		this.logo = logo;
		this.email = email;
		this.year = year;
		this._callfor_papers = callfor_papers;
		this.holdon = holdon;

	}

}