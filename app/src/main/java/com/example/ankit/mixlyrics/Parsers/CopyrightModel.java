
class CopyrightModel {

	public int id;
	public Call_for_papersModel _call_for_papers;
	public String holder;
	public String email;
	public String holder_url;
	public String licence;
	public String logo;
	public int year;
	public String end_time;
	public String licence_url;

	public CopyrightModel(int id, Call_for_papersModel call_for_papers, String holder, String email, String holder_url, String licence, String logo, int year, String end_time, String licence_url) {

		this.id = id;
		this._call_for_papers = call_for_papers;
		this.holder = holder;
		this.email = email;
		this.holder_url = holder_url;
		this.licence = licence;
		this.logo = logo;
		this.year = year;
		this.end_time = end_time;
		this.licence_url = licence_url;

	}

}