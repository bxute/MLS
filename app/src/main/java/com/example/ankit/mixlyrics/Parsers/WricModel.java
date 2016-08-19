import java.util.ArrayList;

class WricModel {

	public String updated;
	public ArrayList<ReplModel> repl;
	public int itemsPerPage;

	public WricModel(String updated, ArrayList<ReplModel> repl, int itemsPerPage) {

		this.updated = updated;
		this.repl = repl;
		this.itemsPerPage = itemsPerPage;

	}

}