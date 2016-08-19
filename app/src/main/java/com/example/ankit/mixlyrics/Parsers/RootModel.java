
class RootModel {

	public AccurseModel _accurse;
	public String uploadedby;
	public String id;
	public String updatedon;
	public String apiVersion;
	public WricModel _wric;
	public String updatededon;
	public String uploadedon;
	public String naste;

	public RootModel(AccurseModel accurse, String uploadedby, String id, String updatedon, String apiVersion, WricModel wric, String updatededon, String uploadedon, String naste) {

		this._accurse = accurse;
		this.uploadedby = uploadedby;
		this.id = id;
		this.updatedon = updatedon;
		this.apiVersion = apiVersion;
		this._wric = wric;
		this.updatededon = updatededon;
		this.uploadedon = uploadedon;
		this.naste = naste;

	}

}