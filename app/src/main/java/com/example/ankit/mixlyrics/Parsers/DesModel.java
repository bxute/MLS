
class DesModel {

	public Boolean required;
	public String type;
	public ContentModel _content;
	public String description;

	public DesModel(Boolean required, String type, ContentModel content, String description) {

		this.required = required;
		this.type = type;
		this._content = content;
		this.description = description;

	}

}