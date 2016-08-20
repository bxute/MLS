
class ExpressModel {

	public ContestNoModel _contestNo;
	public ArePIseedsModel _arePIseeds;
	public String id;
	public ThetaModel _theta;
	public int commentCount;
	public StatuModel _statu;
	public AdeesModel _adees;

	public ExpressModel(ContestNoModel contestNo, ArePIseedsModel arePIseeds, String id, ThetaModel theta, int commentCount, StatuModel statu, AdeesModel adees) {

		this._contestNo = contestNo;
		this._arePIseeds = arePIseeds;
		this.id = id;
		this._theta = theta;
		this.commentCount = commentCount;
		this._statu = statu;
		this._adees = adees;

	}

}