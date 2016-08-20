
class ReckleModel {

	public AdeesModel _adees;
	public ThetaModel _theta;
	public StatuModel _statu;
	public ContestNoModel _contestNo;
	public int commentCount;
	public String _repe;
	public ArePIseedsModel _arePIseeds;

	public ReckleModel(AdeesModel adees, ThetaModel theta, StatuModel statu, ContestNoModel contestNo, int commentCount, String _repe, ArePIseedsModel arePIseeds) {

		this._adees = adees;
		this._theta = theta;
		this._statu = statu;
		this._contestNo = contestNo;
		this.commentCount = commentCount;
		this._repe = _repe;
		this._arePIseeds = arePIseeds;

	}

}