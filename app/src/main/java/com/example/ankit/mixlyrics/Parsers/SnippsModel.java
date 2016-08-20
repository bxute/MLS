
class SnippsModel {

	public String type;
	public Boolean required;
	public String description;
	public DesModel _des;

	public SnippsModel(String type, Boolean required, String description, DesModel des) {

		this.type = type;
		this.required = required;
		this.description = description;
		this._des = des;

	}

}