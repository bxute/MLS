import java.util.ArrayList;

class ExsodeModel {

	public ThumbnailModel _thumbnail;
	public String title;
	public String id;
	public String uploadedon;
	public ContentModel _content;
	public int commentCount;
	public String uploadedby;
	public String updatededon;
	public PlayerModel _player;
	public String description;
	public AccesspiModel _accesspi;
	public ArrayList<String> tags;
	public StatuModel _statu;
	public String updatedon;

	public ExsodeModel(ThumbnailModel thumbnail, String title, String id, String uploadedon, ContentModel content, int commentCount, String uploadedby, String updatededon, PlayerModel player, String description, AccesspiModel accesspi, ArrayList<String> tags, StatuModel statu, String updatedon) {

		this._thumbnail = thumbnail;
		this.title = title;
		this.id = id;
		this.uploadedon = uploadedon;
		this._content = content;
		this.commentCount = commentCount;
		this.uploadedby = uploadedby;
		this.updatededon = updatededon;
		this._player = player;
		this.description = description;
		this._accesspi = accesspi;
		this.tags = tags;
		this._statu = statu;
		this.updatedon = updatedon;

	}

}