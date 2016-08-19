
class StatuModel {

	public String reason;
	public String comment;
	public ContainerModel _container;
	public String list;
	public String value;
	public int modelist;

	public StatuModel(String reason, String comment, ContainerModel container, String list, String value, int modelist) {

		this.reason = reason;
		this.comment = comment;
		this._container = container;
		this.list = list;
		this.value = value;
		this.modelist = modelist;

	}

}