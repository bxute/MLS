
class DesModel {

	public Boolean required;
	public ContentModel _content;
	public String type;
	public String description;

	public DesModel(Boolean required, ContentModel content, String type, String description) {

		this.required = required;
		this._content = content;
		this.type = type;
		this.description = description;

	}

}