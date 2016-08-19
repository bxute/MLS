
class RootModel {

	public String apiVersion;
	public String name;
	public WricModel _wric;
	public MederModel _meder;

	public RootModel(String apiVersion, String name, WricModel wric, MederModel meder) {

		this.apiVersion = apiVersion;
		this.name = name;
		this._wric = wric;
		this._meder = meder;

	}

}