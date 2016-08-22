
class CopyrightModel {

	public String logo;
	public String holder_url;
	public int id;
	public String email;
	public String licence_url;
	public Call_for_papersModel _call_for_papers;
	public String holder;
	public String end_time;
	public int year;
	public String licence;

	public CopyrightModel(String logo, String holder_url, int id, String email, String licence_url, Call_for_papersModel call_for_papers, String holder, String end_time, int year, String licence) {

		this.logo = logo;
		this.holder_url = holder_url;
		this.id = id;
		this.email = email;
		this.licence_url = licence_url;
		this._call_for_papers = call_for_papers;
		this.holder = holder;
		this.end_time = end_time;
		this.year = year;
		this.licence = licence;

	}

}