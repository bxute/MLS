
class StatuModel {

	public String value;
	public int modelist;
	public ContainerModel _container;
	public String reason;
	public String list;
	public String comment;

	public StatuModel(String value, int modelist, ContainerModel container, String reason, String list, String comment) {

		this.value = value;
		this.modelist = modelist;
		this._container = container;
		this.reason = reason;
		this.list = list;
		this.comment = comment;

	}

}