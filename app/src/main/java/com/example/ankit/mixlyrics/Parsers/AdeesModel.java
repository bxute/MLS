
class AdeesModel {

	public String list;
	public String aspectRatio;
	public String videoRespond;
	public String reason;
	public int duration;
	public ContentModel _content;
	public String value;
	public String comment;

	public AdeesModel(String list, String aspectRatio, String videoRespond, String reason, int duration, ContentModel content, String value, String comment) {

		this.list = list;
		this.aspectRatio = aspectRatio;
		this.videoRespond = videoRespond;
		this.reason = reason;
		this.duration = duration;
		this._content = content;
		this.value = value;
		this.comment = comment;

	}

}