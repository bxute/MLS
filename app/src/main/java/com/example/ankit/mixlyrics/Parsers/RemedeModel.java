import java.util.ArrayList;

class RemedeModel {

	public String description;
	public PlayerModel _player;
	public ThumbnailModel _thumbnail;
	public String updatededon;
	public String title;
	public ArrayList<String> tags;
	public String uploadedby;
	public ContentModel _content;
	public int commentCount;
	public StatuModel _statu;
	public String uploadedon;
	public AcceModel _acce;
	public String id;
	public String updatedon;

	public RemedeModel(String description, PlayerModel player, ThumbnailModel thumbnail, String updatededon, String title, ArrayList<String> tags, String uploadedby, ContentModel content, int commentCount, StatuModel statu, String uploadedon, AcceModel acce, String id, String updatedon) {

		this.description = description;
		this._player = player;
		this._thumbnail = thumbnail;
		this.updatededon = updatededon;
		this.title = title;
		this.tags = tags;
		this.uploadedby = uploadedby;
		this._content = content;
		this.commentCount = commentCount;
		this._statu = statu;
		this.uploadedon = uploadedon;
		this._acce = acce;
		this.id = id;
		this.updatedon = updatedon;

	}

}