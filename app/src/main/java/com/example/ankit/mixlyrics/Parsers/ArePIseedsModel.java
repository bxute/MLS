
class ArePIseedsModel {

	public String value;
	public String comment;
	public String aspectRatio;
	public String videoRespond;
	public int duration;
	public String reason;
	public ContentModel _content;
	public String list;

	public ArePIseedsModel(String value, String comment, String aspectRatio, String videoRespond, int duration, String reason, ContentModel content, String list) {

		this.value = value;
		this.comment = comment;
		this.aspectRatio = aspectRatio;
		this.videoRespond = videoRespond;
		this.duration = duration;
		this.reason = reason;
		this._content = content;
		this.list = list;

	}

}