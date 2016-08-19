import java.util.ArrayList;

class ReplModel {

	public ArrayList<String> tags;
	public String updatedon;
	public String uploadedon;
	public String updatededon;
	public String description;
	public AcceModel _acce;
	public PlayerModel _player;
	public String uploadedby;
	public ContentModel _content;
	public ThumbnailModel _thumbnail;
	public StatuModel _statu;
	public String id;
	public int commentCount;
	public String title;

	public ReplModel(ArrayList<String> tags, String updatedon, String uploadedon, String updatededon, String description, AcceModel acce, PlayerModel player, String uploadedby, ContentModel content, ThumbnailModel thumbnail, StatuModel statu, String id, int commentCount, String title) {

		this.tags = tags;
		this.updatedon = updatedon;
		this.uploadedon = uploadedon;
		this.updatededon = updatededon;
		this.description = description;
		this._acce = acce;
		this._player = player;
		this.uploadedby = uploadedby;
		this._content = content;
		this._thumbnail = thumbnail;
		this._statu = statu;
		this.id = id;
		this.commentCount = commentCount;
		this.title = title;

	}

}