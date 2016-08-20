
class ReckleModel {

	public String _repe;
	public AdeesModel _adees;
	public ContestNoModel _contestNo;
	public ArePIseedsModel _arePIseeds;
	public ThetaModel _theta;
	public SedModel _sed;
	public int commentCount;

	public ReckleModel(String _repe, AdeesModel adees, ContestNoModel contestNo, ArePIseedsModel arePIseeds, ThetaModel theta, SedModel sed, int commentCount) {

		this._repe = _repe;
		this._adees = adees;
		this._contestNo = contestNo;
		this._arePIseeds = arePIseeds;
		this._theta = theta;
		this._sed = sed;
		this.commentCount = commentCount;

	}

}