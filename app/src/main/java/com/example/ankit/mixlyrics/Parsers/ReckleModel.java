
class ReckleModel {

	public ArePIseedsModel _arePIseeds;
	public String id;
	public StatuModel _statu;
	public int commentCount;
	public AdeesModel _adees;
	public ThetaModel _theta;
	public ContestNoModel _contestNo;

	public ReckleModel(ArePIseedsModel arePIseeds, String id, StatuModel statu, int commentCount, AdeesModel adees, ThetaModel theta, ContestNoModel contestNo) {

		this._arePIseeds = arePIseeds;
		this.id = id;
		this._statu = statu;
		this.commentCount = commentCount;
		this._adees = adees;
		this._theta = theta;
		this._contestNo = contestNo;

	}

}