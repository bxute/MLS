
class RootModel {

	public WrappersModel _wrappers;
	public PremiceModel _premice;
	public String apiVersion;
	public String itemsType;

	public RootModel(WrappersModel wrappers, PremiceModel premice, String apiVersion, String itemsType) {

		this._wrappers = wrappers;
		this._premice = premice;
		this.apiVersion = apiVersion;
		this.itemsType = itemsType;

	}

}