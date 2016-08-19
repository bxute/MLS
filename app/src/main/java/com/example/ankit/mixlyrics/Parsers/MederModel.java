
class MederModel {

	public PricemModel _pricem;
	public FoltModel _folt;
	public DesModel _des;
	public TagerModel _tager;

	public MederModel(PricemModel pricem, FoltModel folt, DesModel des, TagerModel tager) {

		this._pricem = pricem;
		this._folt = folt;
		this._des = des;
		this._tager = tager;

	}

}