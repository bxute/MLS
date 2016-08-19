
class RootModel {

	public String apiVersion;
	public MederModel _meder;
	public String name;
	public WricModel _wric;

	public RootModel(String apiVersion, MederModel meder, String name, WricModel wric) {

		this.apiVersion = apiVersion;
		this._meder = meder;
		this.name = name;
		this._wric = wric;

	}

}