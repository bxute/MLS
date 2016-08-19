import java.util.ArrayList;

class ExsodeModel {

	public ContentModel _content;
	public String uploadedby;
	public ThumbnailModel _thumbnail;
	public String title;
	public String description;
	public PlayerModel _player;
	public String id;
	public AccesspiModel _accesspi;
	public ArrayList<String> tags;
	public String updatedon;
	public String updatededon;
	public String uploadedon;
	public StatuModel _statu;
	public int commentCount;

	public ExsodeModel(ContentModel content, String uploadedby, ThumbnailModel thumbnail, String title, String description, PlayerModel player, String id, AccesspiModel accesspi, ArrayList<String> tags, String updatedon, String updatededon, String uploadedon, StatuModel statu, int commentCount) {

		this._content = content;
		this.uploadedby = uploadedby;
		this._thumbnail = thumbnail;
		this.title = title;
		this.description = description;
		this._player = player;
		this.id = id;
		this._accesspi = accesspi;
		this.tags = tags;
		this.updatedon = updatedon;
		this.updatededon = updatededon;
		this.uploadedon = uploadedon;
		this._statu = statu;
		this.commentCount = commentCount;

	}

}