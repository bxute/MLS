
class FernsModel {

	public Boolean required;
	public DesModel _des;
	public String type;
	public String description;

	public FernsModel(Boolean required, DesModel des, String type, String description) {

		this.required = required;
		this._des = des;
		this.type = type;
		this.description = description;

	}

}