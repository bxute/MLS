
class RootModel {

	public String name;
	public PropertiesModel _properties;
	public String apiVersion;
	public WricModel _wric;

	public RootModel(String name, PropertiesModel properties, String apiVersion, WricModel wric) {

		this.name = name;
		this._properties = properties;
		this.apiVersion = apiVersion;
		this._wric = wric;

	}

}