
class DesModel {

	public String uploadedby;
	public String updatedon;
	public String type;
	public String uploadedon;
	public String id;
	public String updatededon;
	public Boolean required;
	public String description;
	public FestModel _fest;

	public DesModel(String uploadedby, String updatedon, String type, String uploadedon, String id, String updatededon, Boolean required, String description, FestModel fest) {

		this.uploadedby = uploadedby;
		this.updatedon = updatedon;
		this.type = type;
		this.uploadedon = uploadedon;
		this.id = id;
		this.updatededon = updatededon;
		this.required = required;
		this.description = description;
		this._fest = fest;

	}

}