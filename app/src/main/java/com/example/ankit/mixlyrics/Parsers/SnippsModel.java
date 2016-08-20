
class SnippsModel {

	public String type;
	public DesModel _des;
	public String description;
	public Boolean required;

	public SnippsModel(String type, DesModel des, String description, Boolean required) {

		this.type = type;
		this._des = des;
		this.description = description;
		this.required = required;

	}

}