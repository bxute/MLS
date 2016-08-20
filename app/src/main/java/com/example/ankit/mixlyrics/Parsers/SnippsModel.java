
class SnippsModel {

	public String description;
	public Boolean required;
	public DesModel _des;
	public String type;

	public SnippsModel(String description, Boolean required, DesModel des, String type) {

		this.description = description;
		this.required = required;
		this._des = des;
		this.type = type;

	}

}