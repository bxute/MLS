
class StatuModel {

	public int duration;
	public String value;
	public String comment;
	public String list;
	public String reason;
	public ContentModel _content;

	public StatuModel(int duration, String value, String comment, String list, String reason, ContentModel content) {

		this.duration = duration;
		this.value = value;
		this.comment = comment;
		this.list = list;
		this.reason = reason;
		this._content = content;

	}

}