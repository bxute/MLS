
class FernsModel {

	public Boolean required;
	public String type;
	public String description;
	public DesModel _des;

	public FernsModel(Boolean required, String type, String description, DesModel des) {

		this.required = required;
		this.type = type;
		this.description = description;
		this._des = des;

	}

}