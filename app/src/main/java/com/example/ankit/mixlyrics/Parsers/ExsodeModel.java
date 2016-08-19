import java.util.ArrayList;

class ExsodeModel {

	public String updatedon;
	public ArrayList<String> tags;
	public AdeesModel _adees;
	public String uploadedon;
	public ContestNoModel _contestNo;
	public String uploadedby;
	public String updatededon;
	public String description;
	public ArePIseedsModel _arePIseeds;
	public StatuModel _statu;
	public String title;
	public ThetaModel _theta;
	public String id;
	public int commentCount;

	public ExsodeModel(String updatedon, ArrayList<String> tags, AdeesModel adees, String uploadedon, ContestNoModel contestNo, String uploadedby, String updatededon, String description, ArePIseedsModel arePIseeds, StatuModel statu, String title, ThetaModel theta, String id, int commentCount) {

		this.updatedon = updatedon;
		this.tags = tags;
		this._adees = adees;
		this.uploadedon = uploadedon;
		this._contestNo = contestNo;
		this.uploadedby = uploadedby;
		this.updatededon = updatededon;
		this.description = description;
		this._arePIseeds = arePIseeds;
		this._statu = statu;
		this.title = title;
		this._theta = theta;
		this.id = id;
		this.commentCount = commentCount;

	}

}