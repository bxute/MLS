
class CopyrightModel {

	public String email;
	public int id;
	public String holder_url;
	public Call_for_papersModel _call_for_papers;
	public int year;
	public String licence_url;
	public String logo;
	public String holder;
	public String licence;
	public String end_time;

	public CopyrightModel(String email, int id, String holder_url, Call_for_papersModel call_for_papers, int year, String licence_url, String logo, String holder, String licence, String end_time) {

		this.email = email;
		this.id = id;
		this.holder_url = holder_url;
		this._call_for_papers = call_for_papers;
		this.year = year;
		this.licence_url = licence_url;
		this.logo = logo;
		this.holder = holder;
		this.licence = licence;
		this.end_time = end_time;

	}

}