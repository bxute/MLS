import java.util.ArrayList;

class ExsodeModel {

	public String title;
	public String updatedon;
	public ThetaModel _theta;
	public String uploadedon;
	public String id;
	public ContestNoModel _contestNo;
	public ArrayList<String> tags;
	public ArePIseedsModel _arePIseeds;
	public String updatededon;
	public String description;
	public String uploadedby;
	public int commentCount;
	public StatuModel _statu;

	public ExsodeModel(String title, String updatedon, ThetaModel theta, String uploadedon, String id, ContestNoModel contestNo, ArrayList<String> tags, ArePIseedsModel arePIseeds, String updatededon, String description, String uploadedby, int commentCount, StatuModel statu) {

		this.title = title;
		this.updatedon = updatedon;
		this._theta = theta;
		this.uploadedon = uploadedon;
		this.id = id;
		this._contestNo = contestNo;
		this.tags = tags;
		this._arePIseeds = arePIseeds;
		this.updatededon = updatededon;
		this.description = description;
		this.uploadedby = uploadedby;
		this.commentCount = commentCount;
		this._statu = statu;

	}

}