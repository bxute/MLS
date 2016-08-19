
class RootModel {

	public String updatedon;
	public String uploadedby;
	public String naste;
	public String apiVersion;
	public ProsModel _pros;
	public String updatededon;
	public WricModel _wric;
	public String id;
	public String uploadedon;

	public RootModel(String updatedon, String uploadedby, String naste, String apiVersion, ProsModel pros, String updatededon, WricModel wric, String id, String uploadedon) {

		this.updatedon = updatedon;
		this.uploadedby = uploadedby;
		this.naste = naste;
		this.apiVersion = apiVersion;
		this._pros = pros;
		this.updatededon = updatededon;
		this._wric = wric;
		this.id = id;
		this.uploadedon = uploadedon;

	}

}