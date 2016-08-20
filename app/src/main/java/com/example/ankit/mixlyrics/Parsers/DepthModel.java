
class DepthModel {

	public Boolean required;
	public String description;
	public ContentModel _content;
	public String type;

	public DepthModel(Boolean required, String description, ContentModel content, String type) {

		this.required = required;
		this.description = description;
		this._content = content;
		this.type = type;

	}

}