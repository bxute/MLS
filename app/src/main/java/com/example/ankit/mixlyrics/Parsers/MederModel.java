
class MederModel {

	public DesModel _des;
	public TagerModel _tager;
	public PricemModel _pricem;
	public FernsModel _ferns;

	public MederModel(DesModel des, TagerModel tager, PricemModel pricem, FernsModel ferns) {

		this._des = des;
		this._tager = tager;
		this._pricem = pricem;
		this._ferns = ferns;

	}

}