import java.util.ArrayList;

class WricModel {

	public String updated;
	public int itemsPerPage;
	public ArrayList<ExsodeModel> exsode;

	public WricModel(String updated, int itemsPerPage, ArrayList<ExsodeModel> exsode) {

		this.updated = updated;
		this.itemsPerPage = itemsPerPage;
		this.exsode = exsode;

	}

}