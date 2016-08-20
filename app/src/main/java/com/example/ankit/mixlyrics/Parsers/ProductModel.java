
class ProductModel {

	public PricemModel _pricem;
	public DepthModel _depth;
	public FormatModel _format;
	public TagerModel _tager;

	public ProductModel(PricemModel pricem, DepthModel depth, FormatModel format, TagerModel tager) {

		this._pricem = pricem;
		this._depth = depth;
		this._format = format;
		this._tager = tager;

	}

}