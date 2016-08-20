
class ExpressModel {

	public String id;
	public ThetaModel _theta;
	public int commentCount;
	public StatuModel _statu;
	public ArePIseedsModel _arePIseeds;
	public ContestNoModel _contestNo;
	public AdeesModel _adees;

	public ExpressModel(String id, ThetaModel theta, int commentCount, StatuModel statu, ArePIseedsModel arePIseeds, ContestNoModel contestNo, AdeesModel adees) {

		this.id = id;
		this._theta = theta;
		this.commentCount = commentCount;
		this._statu = statu;
		this._arePIseeds = arePIseeds;
		this._contestNo = contestNo;
		this._adees = adees;

	}

}