
class DesModel {

	public Boolean required;
	public String type;
	public String description;
	public ContentModel _content;

	public DesModel(Boolean required, String type, String description, ContentModel content) {

		this.required = required;
		this.type = type;
		this.description = description;
		this._content = content;

	}

}