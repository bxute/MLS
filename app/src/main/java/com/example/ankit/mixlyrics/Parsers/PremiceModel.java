
class PremiceModel {

	public SnippsModel _snipps;
	public PricemModel _pricem;
	public DepthModel _depth;
	public TagerModel _tager;

	public PremiceModel(SnippsModel snipps, PricemModel pricem, DepthModel depth, TagerModel tager) {

		this._snipps = snipps;
		this._pricem = pricem;
		this._depth = depth;
		this._tager = tager;

	}

}