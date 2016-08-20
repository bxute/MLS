
class AdeesModel {

	public String aspectRatio;
	public String videoRespond;
	public String list;
	public String value;
	public String reason;
	public ContentModel _content;
	public String comment;
	public int duration;

	public AdeesModel(String aspectRatio, String videoRespond, String list, String value, String reason, ContentModel content, String comment, int duration) {

		this.aspectRatio = aspectRatio;
		this.videoRespond = videoRespond;
		this.list = list;
		this.value = value;
		this.reason = reason;
		this._content = content;
		this.comment = comment;
		this.duration = duration;

	}

}