
class StatuModel {

	public String tag;
	public String comment;
	public ContainerModel _container;
	public String sid;
	public String made;
	public int modelist;

	public StatuModel(String tag, String comment, ContainerModel container, String sid, String made, int modelist) {

		this.tag = tag;
		this.comment = comment;
		this._container = container;
		this.sid = sid;
		this.made = made;
		this.modelist = modelist;

	}

}