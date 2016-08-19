
class MederModel {

	public DesModel _des;
	public FoltModel _folt;
	public PricemModel _pricem;
	public TagerModel _tager;

	public MederModel(DesModel des, FoltModel folt, PricemModel pricem, TagerModel tager) {

		this._des = des;
		this._folt = folt;
		this._pricem = pricem;
		this._tager = tager;

	}

}