
class RootModel {

	public String apiVersion;
	public String itemsType;
	public PremiceModel _premice;
	public WrppersModel _wrppers;

	public RootModel(String apiVersion, String itemsType, PremiceModel premice, WrppersModel wrppers) {

		this.apiVersion = apiVersion;
		this.itemsType = itemsType;
		this._premice = premice;
		this._wrppers = wrppers;

	}

}