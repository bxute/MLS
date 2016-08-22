
class CopyrightModel {

	public int id;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String licence;
	public String licence_url;
	public String email;
	public int year;
	public String holder;
	public String holder_url;

	public CopyrightModel(int id, String logo, Call_for_papersModel call_for_papers, String end_time, String licence, String licence_url, String email, int year, String holder, String holder_url) {

		this.id = id;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.licence = licence;
		this.licence_url = licence_url;
		this.email = email;
		this.year = year;
		this.holder = holder;
		this.holder_url = holder_url;

	}

}