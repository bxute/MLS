
class SnippsModel {

	public String description;
	public String type;
	public Boolean required;
	public DesModel _des;

	public SnippsModel(String description, String type, Boolean required, DesModel des) {

		this.description = description;
		this.type = type;
		this.required = required;
		this._des = des;

	}

}