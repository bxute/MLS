
class DesModel {

	public String description;
	public String type;
	public ComplianceModel _compliance;
	public Boolean required;

	public DesModel(String description, String type, ComplianceModel compliance, Boolean required) {

		this.description = description;
		this.type = type;
		this._compliance = compliance;
		this.required = required;

	}

}