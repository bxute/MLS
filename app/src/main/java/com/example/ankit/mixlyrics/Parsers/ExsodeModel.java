import java.util.ArrayList;

class ExsodeModel {

	public String updatededon;
	public String updatedon;
	public String id;
	public String description;
	public ArrayList<String> tags;
	public String title;
	public PlayerModel _player;
	public String uploadedby;
	public String uploadedon;
	public int commentCount;
	public ContentModel _content;
	public StatuModel _statu;
	public ThumbnailModel _thumbnail;
	public AccesspiModel _accesspi;

	public ExsodeModel(String updatededon, String updatedon, String id, String description, ArrayList<String> tags, String title, PlayerModel player, String uploadedby, String uploadedon, int commentCount, ContentModel content, StatuModel statu, ThumbnailModel thumbnail, AccesspiModel accesspi) {

		this.updatededon = updatededon;
		this.updatedon = updatedon;
		this.id = id;
		this.description = description;
		this.tags = tags;
		this.title = title;
		this._player = player;
		this.uploadedby = uploadedby;
		this.uploadedon = uploadedon;
		this.commentCount = commentCount;
		this._content = content;
		this._statu = statu;
		this._thumbnail = thumbnail;
		this._accesspi = accesspi;

	}

}