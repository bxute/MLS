import java.util.ArrayList;

class WricModel {

	public ArrayList<ReplModel> repl;
	public String updated;
	public int itemsPerPage;

	public WricModel(ArrayList<ReplModel> repl, String updated, int itemsPerPage) {

		this.repl = repl;
		this.updated = updated;
		this.itemsPerPage = itemsPerPage;

	}

}