
class DesModel {

	public String type;
	public ContentModel _content;
	public Boolean required;
	public String description;

	public DesModel(String type, ContentModel content, Boolean required, String description) {

		this.type = type;
		this._content = content;
		this.required = required;
		this.description = description;

	}

}