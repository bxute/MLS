
class PremiceModel {

	public TagerModel _tager;
	public PricemModel _pricem;
	public SnippsModel _snipps;
	public DepthModel _depth;

	public PremiceModel(TagerModel tager, PricemModel pricem, SnippsModel snipps, DepthModel depth) {

		this._tager = tager;
		this._pricem = pricem;
		this._snipps = snipps;
		this._depth = depth;

	}

}