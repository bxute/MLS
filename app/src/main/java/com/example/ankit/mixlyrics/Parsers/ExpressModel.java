
class ExpressModel {

	public AdeesModel _adees;
	public int commentCount;
	public ArePIseedsModel _arePIseeds;
	public String id;
	public ContestNoModel _contestNo;
	public ThetaModel _theta;
	public StatuModel _statu;

	public ExpressModel(AdeesModel adees, int commentCount, ArePIseedsModel arePIseeds, String id, ContestNoModel contestNo, ThetaModel theta, StatuModel statu) {

		this._adees = adees;
		this.commentCount = commentCount;
		this._arePIseeds = arePIseeds;
		this.id = id;
		this._contestNo = contestNo;
		this._theta = theta;
		this._statu = statu;

	}

}