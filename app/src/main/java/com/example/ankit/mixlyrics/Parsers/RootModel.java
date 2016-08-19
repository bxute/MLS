
class RootModel {

	public MederModel _meder;
	public WricModel _wric;
	public String name;
	public String apiVersion;

	public RootModel(MederModel meder, WricModel wric, String name, String apiVersion) {

		this._meder = meder;
		this._wric = wric;
		this.name = name;
		this.apiVersion = apiVersion;

	}

}