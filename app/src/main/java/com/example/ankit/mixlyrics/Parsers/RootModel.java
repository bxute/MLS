
class RootModel {

	public MederModel _meder;
	public String name;
	public String apiVersion;
	public WricModel _wric;

	public RootModel(MederModel meder, String name, String apiVersion, WricModel wric) {

		this._meder = meder;
		this.name = name;
		this.apiVersion = apiVersion;
		this._wric = wric;

	}

}