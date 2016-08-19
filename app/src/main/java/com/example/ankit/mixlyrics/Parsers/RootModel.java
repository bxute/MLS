
class RootModel {

	public String name;
	public WricModel _wric;
	public MederModel _meder;
	public String apiVersion;

	public RootModel(String name, WricModel wric, MederModel meder, String apiVersion) {

		this.name = name;
		this._wric = wric;
		this._meder = meder;
		this.apiVersion = apiVersion;

	}

}