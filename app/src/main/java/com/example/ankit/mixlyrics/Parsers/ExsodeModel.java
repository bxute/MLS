import java.util.ArrayList;

class ExsodeModel {

	public int commentCount;
	public ContentModel _content;
	public String title;
	public String uploadedon;
	public String updatededon;
	public String id;
	public String description;
	public AccesspiModel _accesspi;
	public String uploadedby;
	public StatuModel _statu;
	public PlayerModel _player;
	public ArrayList<String> tags;
	public String updatedon;
	public ThumbnailModel _thumbnail;

	public ExsodeModel(int commentCount, ContentModel content, String title, String uploadedon, String updatededon, String id, String description, AccesspiModel accesspi, String uploadedby, StatuModel statu, PlayerModel player, ArrayList<String> tags, String updatedon, ThumbnailModel thumbnail) {

		this.commentCount = commentCount;
		this._content = content;
		this.title = title;
		this.uploadedon = uploadedon;
		this.updatededon = updatededon;
		this.id = id;
		this.description = description;
		this._accesspi = accesspi;
		this.uploadedby = uploadedby;
		this._statu = statu;
		this._player = player;
		this.tags = tags;
		this.updatedon = updatedon;
		this._thumbnail = thumbnail;

	}

}