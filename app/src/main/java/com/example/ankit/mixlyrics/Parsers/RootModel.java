
class RootModel {

	public String naste;
	public String apiVersion;
	public ProsModel _pros;
	public WricModel _wric;

	public RootModel(String naste, String apiVersion, ProsModel pros, WricModel wric) {

		this.naste = naste;
		this.apiVersion = apiVersion;
		this._pros = pros;
		this._wric = wric;

	}

}