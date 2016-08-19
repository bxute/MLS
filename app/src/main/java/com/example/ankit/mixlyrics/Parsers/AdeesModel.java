
class AdeesModel {

	public String videoRespond;
	public String value;
	public int duration;
	public ContentModel _content;
	public String reason;
	public String comment;
	public String aspectRatio;
	public String list;

	public AdeesModel(String videoRespond, String value, int duration, ContentModel content, String reason, String comment, String aspectRatio, String list) {

		this.videoRespond = videoRespond;
		this.value = value;
		this.duration = duration;
		this._content = content;
		this.reason = reason;
		this.comment = comment;
		this.aspectRatio = aspectRatio;
		this.list = list;

	}

}