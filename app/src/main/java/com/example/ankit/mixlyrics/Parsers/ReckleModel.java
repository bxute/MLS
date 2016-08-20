
class ReckleModel {

	public int commentCount;
	public AdeesModel _adees;
	public StatuModel _statu;
	public ThetaModel _theta;
	public ArePIseedsModel _arePIseeds;
	public String _repe;
	public ContestNoModel _contestNo;

	public ReckleModel(int commentCount, AdeesModel adees, StatuModel statu, ThetaModel theta, ArePIseedsModel arePIseeds, String _repe, ContestNoModel contestNo) {

		this.commentCount = commentCount;
		this._adees = adees;
		this._statu = statu;
		this._theta = theta;
		this._arePIseeds = arePIseeds;
		this._repe = _repe;
		this._contestNo = contestNo;

	}

}