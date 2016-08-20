
class StatuModel {

	public String list;
	public String reason;
	public ContainerModel _container;
	public String comment;
	public String value;
	public int modelist;

	public StatuModel(String list, String reason, ContainerModel container, String comment, String value, int modelist) {

		this.list = list;
		this.reason = reason;
		this._container = container;
		this.comment = comment;
		this.value = value;
		this.modelist = modelist;

	}

}