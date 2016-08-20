
class DepthModel {

	public CroopersModel _croopers;
	public String description;
	public Boolean required;
	public String type;

	public DepthModel(CroopersModel croopers, String description, Boolean required, String type) {

		this._croopers = croopers;
		this.description = description;
		this.required = required;
		this.type = type;

	}

}