import java.util.ArrayList;

class WricModel {

	public int itemsPerPage;
	public String updated;
	public ArrayList<ExsodeModel> exsode;

	public WricModel(int itemsPerPage, String updated, ArrayList<ExsodeModel> exsode) {

		this.itemsPerPage = itemsPerPage;
		this.updated = updated;
		this.exsode = exsode;

	}

}