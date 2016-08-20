
class FernsModel {

	public String description;
	public Boolean required;
	public String type;
	public DesModel _des;

	public FernsModel(String description, Boolean required, String type, DesModel des) {

		this.description = description;
		this.required = required;
		this.type = type;
		this._des = des;

	}

}