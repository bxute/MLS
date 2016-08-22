
class CopyrightModel {

	public String licence;
	public int year;
	public String holder_url;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public int id;
	public String logo;
	public String licence_url;
	public String holder;

	public CopyrightModel(String licence, int year, String holder_url, String end_time, Call_for_papersModel call_for_papers, String email, int id, String logo, String licence_url, String holder) {

		this.licence = licence;
		this.year = year;
		this.holder_url = holder_url;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.id = id;
		this.logo = logo;
		this.licence_url = licence_url;
		this.holder = holder;

	}

}