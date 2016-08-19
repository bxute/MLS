
class StatuModel {

	public int modelist;
	public ContainerModel _container;
	public String comment;
	public String value;
	public String reason;
	public String list;

	public StatuModel(int modelist, ContainerModel container, String comment, String value, String reason, String list) {

		this.modelist = modelist;
		this._container = container;
		this.comment = comment;
		this.value = value;
		this.reason = reason;
		this.list = list;

	}

}