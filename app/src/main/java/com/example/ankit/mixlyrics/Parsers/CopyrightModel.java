
class CopyrightModel {

	public Callfor_papersModel _callfor_papers;
	public String licence_url;
	public String logo;
	public int extem;
	public int year;
	public String holdon;
	public String licence;
	public String holder_url;
	public String endtime;
	public String email;

	public CopyrightModel(Callfor_papersModel callfor_papers, String licence_url, String logo, int extem, int year, String holdon, String licence, String holder_url, String endtime, String email) {

		this._callfor_papers = callfor_papers;
		this.licence_url = licence_url;
		this.logo = logo;
		this.extem = extem;
		this.year = year;
		this.holdon = holdon;
		this.licence = licence;
		this.holder_url = holder_url;
		this.endtime = endtime;
		this.email = email;

	}

}