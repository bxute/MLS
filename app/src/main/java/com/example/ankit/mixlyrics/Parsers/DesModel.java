
class DesModel {

	public String type;
	public Boolean required;
	public String description;
	public ComplianceModel _compliance;

	public DesModel(String type, Boolean required, String description, ComplianceModel compliance) {

		this.type = type;
		this.required = required;
		this.description = description;
		this._compliance = compliance;

	}

}