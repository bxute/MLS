
class SedModel {

	public int modelist;
	public String tag;
	public String sid;
	public String made;
	public String comment;
	public ContainerModel _container;

	public SedModel(int modelist, String tag, String sid, String made, String comment, ContainerModel container) {

		this.modelist = modelist;
		this.tag = tag;
		this.sid = sid;
		this.made = made;
		this.comment = comment;
		this._container = container;

	}

}