
class AdeesModel {

	public int duration;
	public ContentModel _content;
	public String list;
	public String value;
	public String comment;
	public String reason;
	public String aspectRatio;
	public String videoRespond;

	public AdeesModel(int duration, ContentModel content, String list, String value, String comment, String reason, String aspectRatio, String videoRespond) {

		this.duration = duration;
		this._content = content;
		this.list = list;
		this.value = value;
		this.comment = comment;
		this.reason = reason;
		this.aspectRatio = aspectRatio;
		this.videoRespond = videoRespond;

	}

}