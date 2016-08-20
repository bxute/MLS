
class RootModel {

	public String apiVersion;
	public ProductModel _product;
	public String name;
	public WrppersModel _wrppers;

	public RootModel(String apiVersion, ProductModel product, String name, WrppersModel wrppers) {

		this.apiVersion = apiVersion;
		this._product = product;
		this.name = name;
		this._wrppers = wrppers;

	}

}