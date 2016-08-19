import java.util.ArrayList;

class ExsodeModel {

	public AccesspiModel _accesspi;
	public String title;
	public StatuModel _statu;
	public String updatedon;
	public String description;
	public int commentCount;
	public String uploadedon;
	public PlayerModel _player;
	public String id;
	public String uploadedby;
	public ArrayList<String> tags;
	public ThumbnailModel _thumbnail;
	public String updatededon;
	public ContentModel _content;

	public ExsodeModel(AccesspiModel accesspi, String title, StatuModel statu, String updatedon, String description, int commentCount, String uploadedon, PlayerModel player, String id, String uploadedby, ArrayList<String> tags, ThumbnailModel thumbnail, String updatededon, ContentModel content) {

		this._accesspi = accesspi;
		this.title = title;
		this._statu = statu;
		this.updatedon = updatedon;
		this.description = description;
		this.commentCount = commentCount;
		this.uploadedon = uploadedon;
		this._player = player;
		this.id = id;
		this.uploadedby = uploadedby;
		this.tags = tags;
		this._thumbnail = thumbnail;
		this.updatededon = updatededon;
		this._content = content;

	}

}