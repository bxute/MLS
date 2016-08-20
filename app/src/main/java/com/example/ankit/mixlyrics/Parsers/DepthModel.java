
class DepthModel {

	public KriteModel _krite;
	public String description;
	public Boolean required;
	public String type;

	public DepthModel(KriteModel krite, String description, Boolean required, String type) {

		this._krite = krite;
		this.description = description;
		this.required = required;
		this.type = type;

	}

}