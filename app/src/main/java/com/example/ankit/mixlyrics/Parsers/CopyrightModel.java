
class CopyrightModel {

	public String email;
	public Callfor_papersModel _callfor_papers;
	public String endtime;
	public int year;
	public int extem;
	public String licence_url;
	public String holder_url;
	public String holdon;
	public String logo;
	public String licence;

	public CopyrightModel(String email, Callfor_papersModel callfor_papers, String endtime, int year, int extem, String licence_url, String holder_url, String holdon, String logo, String licence) {

		this.email = email;
		this._callfor_papers = callfor_papers;
		this.endtime = endtime;
		this.year = year;
		this.extem = extem;
		this.licence_url = licence_url;
		this.holder_url = holder_url;
		this.holdon = holdon;
		this.logo = logo;
		this.licence = licence;

	}

}