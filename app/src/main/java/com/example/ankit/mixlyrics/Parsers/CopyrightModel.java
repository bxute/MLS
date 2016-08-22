
class CopyrightModel {

	public String licence_url;
	public String holdon;
	public String endtime;
	public Callfor_papersModel _callfor_papers;
	public String email;
	public int extem;
	public String licence;
	public int year;
	public String holder_url;
	public String logo;

	public CopyrightModel(String licence_url, String holdon, String endtime, Callfor_papersModel callfor_papers, String email, int extem, String licence, int year, String holder_url, String logo) {

		this.licence_url = licence_url;
		this.holdon = holdon;
		this.endtime = endtime;
		this._callfor_papers = callfor_papers;
		this.email = email;
		this.extem = extem;
		this.licence = licence;
		this.year = year;
		this.holder_url = holder_url;
		this.logo = logo;

	}

}