
class SizerModel {

	public DesModel _des;
	public String description;
	public Boolean required;
	public String type;

	public SizerModel(DesModel des, String description, Boolean required, String type) {

		this._des = des;
		this.description = description;
		this.required = required;
		this.type = type;

	}

}