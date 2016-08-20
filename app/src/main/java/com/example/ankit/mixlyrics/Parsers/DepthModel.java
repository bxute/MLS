
class DepthModel {

	public String type;
	public String description;
	public Boolean required;
	public CroopersModel _croopers;

	public DepthModel(String type, String description, Boolean required, CroopersModel croopers) {

		this.type = type;
		this.description = description;
		this.required = required;
		this._croopers = croopers;

	}

}