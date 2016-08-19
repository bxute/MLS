
class RootModel {

	public String name;
	public WricModel _wric;
	public String apiVersion;
	public PropertiesModel _properties;

	public RootModel(String name, WricModel wric, String apiVersion, PropertiesModel properties) {

		this.name = name;
		this._wric = wric;
		this.apiVersion = apiVersion;
		this._properties = properties;

	}

}