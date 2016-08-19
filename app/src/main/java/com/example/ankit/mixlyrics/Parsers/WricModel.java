import java.util.ArrayList;

class WricModel {

	public ArrayList<ReplModel> repl;
	public int itemsPerPage;
	public String updated;

	public WricModel(ArrayList<ReplModel> repl, int itemsPerPage, String updated) {

		this.repl = repl;
		this.itemsPerPage = itemsPerPage;
		this.updated = updated;

	}

}