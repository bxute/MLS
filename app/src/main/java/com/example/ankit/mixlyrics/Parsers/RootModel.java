
class RootModel {

	public PremiceModel _premice;
	public String itemsType;
	public String apiVersion;
	public WrappersModel _wrappers;

	public RootModel(PremiceModel premice, String itemsType, String apiVersion, WrappersModel wrappers) {

		this._premice = premice;
		this.itemsType = itemsType;
		this.apiVersion = apiVersion;
		this._wrappers = wrappers;

	}

}