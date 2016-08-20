
class AdeesModel {

	public String videoRespond;
	public String value;
	public String list;
	public String aspectRatio;
	public ContentModel _content;
	public String comment;
	public String reason;
	public int duration;

	public AdeesModel(String videoRespond, String value, String list, String aspectRatio, ContentModel content, String comment, String reason, int duration) {

		this.videoRespond = videoRespond;
		this.value = value;
		this.list = list;
		this.aspectRatio = aspectRatio;
		this._content = content;
		this.comment = comment;
		this.reason = reason;
		this.duration = duration;

	}

}