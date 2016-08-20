
class DesModel {

	public String description;
	public String type;
	public Boolean required;
	public ComplianceModel _compliance;

	public DesModel(String description, String type, Boolean required, ComplianceModel compliance) {

		this.description = description;
		this.type = type;
		this.required = required;
		this._compliance = compliance;

	}

}