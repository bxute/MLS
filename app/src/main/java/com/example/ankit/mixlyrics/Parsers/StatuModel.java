
class StatuModel {

	public String list;
	public String comment;
	public String reason;
	public int modelist;
	public String value;
	public ContainerModel _container;

	public StatuModel(String list, String comment, String reason, int modelist, String value, ContainerModel container) {

		this.list = list;
		this.comment = comment;
		this.reason = reason;
		this.modelist = modelist;
		this.value = value;
		this._container = container;

	}

}