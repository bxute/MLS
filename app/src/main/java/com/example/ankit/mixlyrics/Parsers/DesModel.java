
class DesModel {

	public String description;
	public Boolean required;
	public String type;
	public ComplianceModel _compliance;

	public DesModel(String description, Boolean required, String type, ComplianceModel compliance) {

		this.description = description;
		this.required = required;
		this.type = type;
		this._compliance = compliance;

	}

}