import java.util.ArrayList;

class ExsodeModel {

	public ContentModel _content;
	public String uploadedby;
	public String uploadedon;
	public int commentCount;
	public AccesspiModel _accesspi;
	public String id;
	public ArrayList<String> tags;
	public PlayerModel _player;
	public String description;
	public String title;
	public ThumbnailModel _thumbnail;
	public String updatededon;
	public String updatedon;
	public StatuModel _statu;

	public ExsodeModel(ContentModel content, String uploadedby, String uploadedon, int commentCount, AccesspiModel accesspi, String id, ArrayList<String> tags, PlayerModel player, String description, String title, ThumbnailModel thumbnail, String updatededon, String updatedon, StatuModel statu) {

		this._content = content;
		this.uploadedby = uploadedby;
		this.uploadedon = uploadedon;
		this.commentCount = commentCount;
		this._accesspi = accesspi;
		this.id = id;
		this.tags = tags;
		this._player = player;
		this.description = description;
		this.title = title;
		this._thumbnail = thumbnail;
		this.updatededon = updatededon;
		this.updatedon = updatedon;
		this._statu = statu;

	}

}