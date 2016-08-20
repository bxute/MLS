
class DesModel {

	public ContentModel _content;
	public String description;
	public String type;
	public Boolean required;

	public DesModel(ContentModel content, String description, String type, Boolean required) {

		this._content = content;
		this.description = description;
		this.type = type;
		this.required = required;

	}

}