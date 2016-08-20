
class AdeesModel {

	public String value;
	public String list;
	public String aspectRatio;
	public String reason;
	public int duration;
	public ContentModel _content;
	public String comment;
	public String videoRespond;

	public AdeesModel(String value, String list, String aspectRatio, String reason, int duration, ContentModel content, String comment, String videoRespond) {

		this.value = value;
		this.list = list;
		this.aspectRatio = aspectRatio;
		this.reason = reason;
		this.duration = duration;
		this._content = content;
		this.comment = comment;
		this.videoRespond = videoRespond;

	}

}