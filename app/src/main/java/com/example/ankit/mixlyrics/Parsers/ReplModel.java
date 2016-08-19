import java.util.ArrayList;

class ReplModel {

	public ArrayList<String> tags;
	public ContentModel _content;
	public String title;
	public PlayerModel _player;
	public String uploadedon;
	public String updatededon;
	public StatuModel _statu;
	public String description;
	public String uploadedby;
	public String id;
	public String updatedon;
	public int commentCount;
	public ThumbnailModel _thumbnail;
	public AcceModel _acce;

	public ReplModel(ArrayList<String> tags, ContentModel content, String title, PlayerModel player, String uploadedon, String updatededon, StatuModel statu, String description, String uploadedby, String id, String updatedon, int commentCount, ThumbnailModel thumbnail, AcceModel acce) {

		this.tags = tags;
		this._content = content;
		this.title = title;
		this._player = player;
		this.uploadedon = uploadedon;
		this.updatededon = updatededon;
		this._statu = statu;
		this.description = description;
		this.uploadedby = uploadedby;
		this.id = id;
		this.updatedon = updatedon;
		this.commentCount = commentCount;
		this._thumbnail = thumbnail;
		this._acce = acce;

	}

}