
class PremiceModel {

	public TagerModel _tager;
	public DepthModel _depth;
	public PricemModel _pricem;
	public SnippsModel _snipps;

	public PremiceModel(TagerModel tager, DepthModel depth, PricemModel pricem, SnippsModel snipps) {

		this._tager = tager;
		this._depth = depth;
		this._pricem = pricem;
		this._snipps = snipps;

	}

}