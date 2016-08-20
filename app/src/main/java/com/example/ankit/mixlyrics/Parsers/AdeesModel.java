
class AdeesModel {

	public String aspectRatio;
	public String list;
	public int duration;
	public String comment;
	public String videoRespond;
	public String reason;
	public String value;
	public ContentModel _content;

	public AdeesModel(String aspectRatio, String list, int duration, String comment, String videoRespond, String reason, String value, ContentModel content) {

		this.aspectRatio = aspectRatio;
		this.list = list;
		this.duration = duration;
		this.comment = comment;
		this.videoRespond = videoRespond;
		this.reason = reason;
		this.value = value;
		this._content = content;

	}

}