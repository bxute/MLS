
class DepthModel {

	public CroopersModel _croopers;
	public Boolean required;
	public String description;
	public String type;

	public DepthModel(CroopersModel croopers, Boolean required, String description, String type) {

		this._croopers = croopers;
		this.required = required;
		this.description = description;
		this.type = type;

	}

}