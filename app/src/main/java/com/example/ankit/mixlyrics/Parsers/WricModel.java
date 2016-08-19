import java.util.ArrayList;

class WricModel {

	public String updated;
	public ArrayList<ExsodeModel> exsode;
	public int itemsPerPage;

	public WricModel(String updated, ArrayList<ExsodeModel> exsode, int itemsPerPage) {

		this.updated = updated;
		this.exsode = exsode;
		this.itemsPerPage = itemsPerPage;

	}

}