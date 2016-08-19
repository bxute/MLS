
class DesModel {

	public Boolean required;
	public String type;
	public CompModel _comp;
	public String description;

	public DesModel(Boolean required, String type, CompModel comp, String description) {

		this.required = required;
		this.type = type;
		this._comp = comp;
		this.description = description;

	}

}