
class RootModel {

	public String name;
	public WrppersModel _wrppers;
	public PremiceModel _premice;
	public String apiVersion;

	public RootModel(String name, WrppersModel wrppers, PremiceModel premice, String apiVersion) {

		this.name = name;
		this._wrppers = wrppers;
		this._premice = premice;
		this.apiVersion = apiVersion;

	}

}