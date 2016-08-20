
class RootModel {

	public String name;
	public String apiVersion;
	public MineModel _mine;
	public WrppersModel _wrppers;

	public RootModel(String name, String apiVersion, MineModel mine, WrppersModel wrppers) {

		this.name = name;
		this.apiVersion = apiVersion;
		this._mine = mine;
		this._wrppers = wrppers;

	}

}