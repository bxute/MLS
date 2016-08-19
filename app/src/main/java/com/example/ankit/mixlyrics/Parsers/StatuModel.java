
class StatuModel {

	public String comment;
	public ContentModel _content;
	public String list;
	public String reason;
	public String value;
	public int duration;

	public StatuModel(String comment, ContentModel content, String list, String reason, String value, int duration) {

		this.comment = comment;
		this._content = content;
		this.list = list;
		this.reason = reason;
		this.value = value;
		this.duration = duration;

	}

}