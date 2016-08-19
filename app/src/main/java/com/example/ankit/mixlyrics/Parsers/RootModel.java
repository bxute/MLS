
class RootModel {

	public WricModel _wric;
	public String apiVersion;
	public PropertiesModel _properties;
	public String name;

	public RootModel(WricModel wric, String apiVersion, PropertiesModel properties, String name) {

		this._wric = wric;
		this.apiVersion = apiVersion;
		this._properties = properties;
		this.name = name;

	}

}