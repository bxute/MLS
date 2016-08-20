
class AdeesModel {

	public String list;
	public String value;
	public String videoRespond;
	public ContentModel _content;
	public String reason;
	public int duration;
	public String aspectRatio;
	public String comment;

	public AdeesModel(String list, String value, String videoRespond, ContentModel content, String reason, int duration, String aspectRatio, String comment) {

		this.list = list;
		this.value = value;
		this.videoRespond = videoRespond;
		this._content = content;
		this.reason = reason;
		this.duration = duration;
		this.aspectRatio = aspectRatio;
		this.comment = comment;

	}

}