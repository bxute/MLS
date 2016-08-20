
class RootModel {

	public String itemsType;
	public PremiceModel _premice;
	public WrappersModel _wrappers;
	public String apiVersion;

	public RootModel(String itemsType, PremiceModel premice, WrappersModel wrappers, String apiVersion) {

		this.itemsType = itemsType;
		this._premice = premice;
		this._wrappers = wrappers;
		this.apiVersion = apiVersion;

	}

}