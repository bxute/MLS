
class DesModel {

	public String type;
	public String description;
	public ContentModel _content;
	public Boolean required;

	public DesModel(String type, String description, ContentModel content, Boolean required) {

		this.type = type;
		this.description = description;
		this._content = content;
		this.required = required;

	}

}