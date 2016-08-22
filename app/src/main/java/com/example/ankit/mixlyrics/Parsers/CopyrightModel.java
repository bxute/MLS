
class CopyrightModel {

	public String holder_url;
	public String licence;
	public String end_time;
	public String holder;
	public Call_for_papersModel _call_for_papers;
	public String licence_url;
	public int id;
	public String email;
	public int year;
	public String logo;

	public CopyrightModel(String holder_url, String licence, String end_time, String holder, Call_for_papersModel call_for_papers, String licence_url, int id, String email, int year, String logo) {

		this.holder_url = holder_url;
		this.licence = licence;
		this.end_time = end_time;
		this.holder = holder;
		this._call_for_papers = call_for_papers;
		this.licence_url = licence_url;
		this.id = id;
		this.email = email;
		this.year = year;
		this.logo = logo;

	}

}