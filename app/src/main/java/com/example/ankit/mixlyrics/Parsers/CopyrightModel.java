
class CopyrightModel {

	public int year;
	public String logo;
	public String holder_url;
	public String end_time;
	public String holder;
	public String licence_url;
	public String licence;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public int id;

	public CopyrightModel(int year, String logo, String holder_url, String end_time, String holder, String licence_url, String licence, String email, Call_for_papersModel call_for_papers, int id) {

		this.year = year;
		this.logo = logo;
		this.holder_url = holder_url;
		this.end_time = end_time;
		this.holder = holder;
		this.licence_url = licence_url;
		this.licence = licence;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.id = id;

	}

}