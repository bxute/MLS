
class CopyrightModel {

	public int id;
	public String licence;
	public String end_time;
	public String email;
	public String licence_url;
	public String holder;
	public String holder_url;
	public Call_for_papersModel _call_for_papers;
	public int year;
	public String logo;

	public CopyrightModel(int id, String licence, String end_time, String email, String licence_url, String holder, String holder_url, Call_for_papersModel call_for_papers, int year, String logo) {

		this.id = id;
		this.licence = licence;
		this.end_time = end_time;
		this.email = email;
		this.licence_url = licence_url;
		this.holder = holder;
		this.holder_url = holder_url;
		this._call_for_papers = call_for_papers;
		this.year = year;
		this.logo = logo;

	}

}