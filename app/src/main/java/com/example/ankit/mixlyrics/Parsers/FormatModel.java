
class FormatModel {

	public Boolean required;
	public String description;
	public DesModel _des;
	public String type;

	public FormatModel(Boolean required, String description, DesModel des, String type) {

		this.required = required;
		this.description = description;
		this._des = des;
		this.type = type;

	}

}