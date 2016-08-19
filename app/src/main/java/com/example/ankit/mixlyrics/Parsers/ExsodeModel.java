import java.util.ArrayList;

class ExsodeModel {

	public String uploadedby;
	public ThetaModel _theta;
	public int commentCount;
	public String description;
	public ArePIseedsModel _arePIseeds;
	public ContestNoModel _contestNo;
	public String title;
	public String id;
	public String updatedon;
	public String updatededon;
	public StatuModel _statu;
	public String uploadedon;
	public ArrayList<String> tags;

	public ExsodeModel(String uploadedby, ThetaModel theta, int commentCount, String description, ArePIseedsModel arePIseeds, ContestNoModel contestNo, String title, String id, String updatedon, String updatededon, StatuModel statu, String uploadedon, ArrayList<String> tags) {

		this.uploadedby = uploadedby;
		this._theta = theta;
		this.commentCount = commentCount;
		this.description = description;
		this._arePIseeds = arePIseeds;
		this._contestNo = contestNo;
		this.title = title;
		this.id = id;
		this.updatedon = updatedon;
		this.updatededon = updatededon;
		this._statu = statu;
		this.uploadedon = uploadedon;
		this.tags = tags;

	}

}