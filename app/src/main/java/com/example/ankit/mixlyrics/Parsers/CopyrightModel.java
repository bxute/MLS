
class CopyrightModel {

	public String licence;
	public int id;
	public String logo;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public int year;
	public String end_time;
	public String holder;
	public String licence_url;
	public String holder_url;

	public CopyrightModel(String licence, int id, String logo, String email, Call_for_papersModel call_for_papers, int year, String end_time, String holder, String licence_url, String holder_url) {

		this.licence = licence;
		this.id = id;
		this.logo = logo;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.year = year;
		this.end_time = end_time;
		this.holder = holder;
		this.licence_url = licence_url;
		this.holder_url = holder_url;

	}

}