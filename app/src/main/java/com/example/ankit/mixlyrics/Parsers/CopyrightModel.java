
class CopyrightModel {

	public int year;
	public String licence;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String logo;
	public String holder;
	public String licence_url;
	public String email;
	public String holder_url;

	public CopyrightModel(int year, String licence, String end_time, Call_for_papersModel call_for_papers, int id, String logo, String holder, String licence_url, String email, String holder_url) {

		this.year = year;
		this.licence = licence;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.logo = logo;
		this.holder = holder;
		this.licence_url = licence_url;
		this.email = email;
		this.holder_url = holder_url;

	}

}