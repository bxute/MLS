
class DesModel {

	public Boolean required;
	public String description;
	public ComplianceModel _compliance;
	public String type;

	public DesModel(Boolean required, String description, ComplianceModel compliance, String type) {

		this.required = required;
		this.description = description;
		this._compliance = compliance;
		this.type = type;

	}

}