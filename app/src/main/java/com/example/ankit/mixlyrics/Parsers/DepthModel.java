
class DepthModel {

	public String type;
	public Boolean required;
	public CroopersModel _croopers;
	public String description;

	public DepthModel(String type, Boolean required, CroopersModel croopers, String description) {

		this.type = type;
		this.required = required;
		this._croopers = croopers;
		this.description = description;

	}

}