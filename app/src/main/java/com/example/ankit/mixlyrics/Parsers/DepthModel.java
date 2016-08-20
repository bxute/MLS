
class DepthModel {

	public String description;
	public String type;
	public CroopersModel _croopers;
	public Boolean required;

	public DepthModel(String description, String type, CroopersModel croopers, Boolean required) {

		this.description = description;
		this.type = type;
		this._croopers = croopers;
		this.required = required;

	}

}