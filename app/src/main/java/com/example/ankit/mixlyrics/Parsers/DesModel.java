
class DesModel {

	public String type;
	public String description;
	public Boolean required;
	public ComplianceModel _compliance;

	public DesModel(String type, String description, Boolean required, ComplianceModel compliance) {

		this.type = type;
		this.description = description;
		this.required = required;
		this._compliance = compliance;

	}

}