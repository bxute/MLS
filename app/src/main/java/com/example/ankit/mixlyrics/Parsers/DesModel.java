
class DesModel {

	public ContentModel _content;
	public String type;
	public Boolean required;
	public String description;

	public DesModel(ContentModel content, String type, Boolean required, String description) {

		this._content = content;
		this.type = type;
		this.required = required;
		this.description = description;

	}

}