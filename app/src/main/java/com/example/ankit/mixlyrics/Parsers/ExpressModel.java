import java.util.ArrayList;

class ExpressModel {

	public ContestNoModel _contestNo;
	public ThetaModel _theta;
	public int commentCount;
	public String uploadedon;
	public String description;
	public ArrayList<String> tags;
	public StatuModel _statu;
	public ArePIseedsModel _arePIseeds;
	public String uploadedby;
	public String updatededon;
	public AdeesModel _adees;
	public String id;
	public String title;
	public String updatedon;

	public ExpressModel(ContestNoModel contestNo, ThetaModel theta, int commentCount, String uploadedon, String description, ArrayList<String> tags, StatuModel statu, ArePIseedsModel arePIseeds, String uploadedby, String updatededon, AdeesModel adees, String id, String title, String updatedon) {

		this._contestNo = contestNo;
		this._theta = theta;
		this.commentCount = commentCount;
		this.uploadedon = uploadedon;
		this.description = description;
		this.tags = tags;
		this._statu = statu;
		this._arePIseeds = arePIseeds;
		this.uploadedby = uploadedby;
		this.updatededon = updatededon;
		this._adees = adees;
		this.id = id;
		this.title = title;
		this.updatedon = updatedon;

	}

}