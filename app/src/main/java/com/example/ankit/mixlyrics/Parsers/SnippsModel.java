
class SnippsModel {

	public String description;
	public String type;
	public DesModel _des;
	public Boolean required;

	public SnippsModel(String description, String type, DesModel des, Boolean required) {

		this.description = description;
		this.type = type;
		this._des = des;
		this.required = required;

	}

}