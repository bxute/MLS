
class PremiceModel {

	public DepthModel _depth;
	public SnippsModel _snipps;
	public PricemModel _pricem;
	public TagerModel _tager;

	public PremiceModel(DepthModel depth, SnippsModel snipps, PricemModel pricem, TagerModel tager) {

		this._depth = depth;
		this._snipps = snipps;
		this._pricem = pricem;
		this._tager = tager;

	}

}