import java.util.ArrayList;

class ReplModel {

	public ArrayList<String> tags;
	public String uploadedby;
	public String title;
	public String updatededon;
	public String description;
	public String id;
	public AcceModel _acce;
	public String uploadedon;
	public int commentCount;
	public StatuModel _statu;
	public ContentModel _content;
	public String updatedon;
	public PlayerModel _player;
	public ThumbnailModel _thumbnail;

	public ReplModel(ArrayList<String> tags, String uploadedby, String title, String updatededon, String description, String id, AcceModel acce, String uploadedon, int commentCount, StatuModel statu, ContentModel content, String updatedon, PlayerModel player, ThumbnailModel thumbnail) {

		this.tags = tags;
		this.uploadedby = uploadedby;
		this.title = title;
		this.updatededon = updatededon;
		this.description = description;
		this.id = id;
		this._acce = acce;
		this.uploadedon = uploadedon;
		this.commentCount = commentCount;
		this._statu = statu;
		this._content = content;
		this.updatedon = updatedon;
		this._player = player;
		this._thumbnail = thumbnail;

	}

}