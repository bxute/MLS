
class FoltModel {

	public Boolean required;
	public String type;
	public String description;
	public DesModel _des;

	public FoltModel(Boolean required, String type, String description, DesModel des) {

		this.required = required;
		this.type = type;
		this.description = description;
		this._des = des;

	}

}