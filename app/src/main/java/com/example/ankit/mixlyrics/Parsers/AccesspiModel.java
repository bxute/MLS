
class AccesspiModel {

	public String aspectRatio;
	public String videoRespond;
	public int duration;
	public String value;
	public String comment;
	public String list;
	public String reason;
	public ContentModel _content;

	public AccesspiModel(String aspectRatio, String videoRespond, int duration, String value, String comment, String list, String reason, ContentModel content) {

		this.aspectRatio = aspectRatio;
		this.videoRespond = videoRespond;
		this.duration = duration;
		this.value = value;
		this.comment = comment;
		this.list = list;
		this.reason = reason;
		this._content = content;

	}

}