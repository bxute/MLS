
class PremiceModel {

	public DepthModel _depth;
	public TagerModel _tager;
	public PricemModel _pricem;
	public SnippsModel _snipps;

	public PremiceModel(DepthModel depth, TagerModel tager, PricemModel pricem, SnippsModel snipps) {

		this._depth = depth;
		this._tager = tager;
		this._pricem = pricem;
		this._snipps = snipps;

	}

}