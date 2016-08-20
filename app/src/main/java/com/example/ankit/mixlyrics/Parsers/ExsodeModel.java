import java.util.ArrayList;

class ExsodeModel {

	public String id;
	public ArrayList<String> tags;
	public String title;
	public String updatedon;
	public String uploadedby;
	public int commentCount;
	public String uploadedon;
	public StatuModel _statu;
	public ContestNoModel _contestNo;
	public AdeesModel _adees;
	public String description;
	public ArePIseedsModel _arePIseeds;
	public String updatededon;
	public ThetaModel _theta;

	public ExsodeModel(String id, ArrayList<String> tags, String title, String updatedon, String uploadedby, int commentCount, String uploadedon, StatuModel statu, ContestNoModel contestNo, AdeesModel adees, String description, ArePIseedsModel arePIseeds, String updatededon, ThetaModel theta) {

		this.id = id;
		this.tags = tags;
		this.title = title;
		this.updatedon = updatedon;
		this.uploadedby = uploadedby;
		this.commentCount = commentCount;
		this.uploadedon = uploadedon;
		this._statu = statu;
		this._contestNo = contestNo;
		this._adees = adees;
		this.description = description;
		this._arePIseeds = arePIseeds;
		this.updatededon = updatededon;
		this._theta = theta;

	}

}