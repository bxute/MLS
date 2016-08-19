
class ProsModel {

	public DesModel _des;
	public PricemModel _pricem;
	public TagerModel _tager;
	public FoltModel _folt;

	public ProsModel(DesModel des, PricemModel pricem, TagerModel tager, FoltModel folt) {

		this._des = des;
		this._pricem = pricem;
		this._tager = tager;
		this._folt = folt;

	}

}