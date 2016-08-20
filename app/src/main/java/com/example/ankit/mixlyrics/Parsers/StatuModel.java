
class StatuModel {

	public String value;
	public String comment;
	public String reason;
	public int modelist;
	public String list;
	public ContainerModel _container;

	public StatuModel(String value, String comment, String reason, int modelist, String list, ContainerModel container) {

		this.value = value;
		this.comment = comment;
		this.reason = reason;
		this.modelist = modelist;
		this.list = list;
		this._container = container;

	}

}