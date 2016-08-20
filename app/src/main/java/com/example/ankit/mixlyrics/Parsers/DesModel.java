
class DesModel {

	public ComplianceModel _compliance;
	public Boolean required;
	public String description;
	public String type;

	public DesModel(ComplianceModel compliance, Boolean required, String description, String type) {

		this._compliance = compliance;
		this.required = required;
		this.description = description;
		this.type = type;

	}

}