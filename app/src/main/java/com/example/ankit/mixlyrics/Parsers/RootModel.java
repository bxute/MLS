
class RootModel {

	public WrappersModel _wrappers;
	public String apiVersion;
	public String itemsType;
	public PremiceModel _premice;

	public RootModel(WrappersModel wrappers, String apiVersion, String itemsType, PremiceModel premice) {

		this._wrappers = wrappers;
		this.apiVersion = apiVersion;
		this.itemsType = itemsType;
		this._premice = premice;

	}

}