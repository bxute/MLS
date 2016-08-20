
class ExpressModel {

	public ThetaModel _theta;
	public String id;
	public ArePIseedsModel _arePIseeds;
	public int commentCount;
	public StatuModel _statu;
	public ContestNoModel _contestNo;
	public AdeesModel _adees;

	public ExpressModel(ThetaModel theta, String id, ArePIseedsModel arePIseeds, int commentCount, StatuModel statu, ContestNoModel contestNo, AdeesModel adees) {

		this._theta = theta;
		this.id = id;
		this._arePIseeds = arePIseeds;
		this.commentCount = commentCount;
		this._statu = statu;
		this._contestNo = contestNo;
		this._adees = adees;

	}

}