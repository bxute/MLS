
class RootModel {

	public String apiVersion;
	public WrppersModel _wrppers;
	public MineModel _mine;
	public String name;

	public RootModel(String apiVersion, WrppersModel wrppers, MineModel mine, String name) {

		this.apiVersion = apiVersion;
		this._wrppers = wrppers;
		this._mine = mine;
		this.name = name;

	}

}