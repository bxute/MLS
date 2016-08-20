
class PremiceModel {

	public TagerModel _tager;
	public DepthModel _depth;
	public SizerModel _sizer;
	public PricemModel _pricem;

	public PremiceModel(TagerModel tager, DepthModel depth, SizerModel sizer, PricemModel pricem) {

		this._tager = tager;
		this._depth = depth;
		this._sizer = sizer;
		this._pricem = pricem;

	}

}