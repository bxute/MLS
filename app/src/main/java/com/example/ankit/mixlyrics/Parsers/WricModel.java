import java.util.ArrayList;

class WricModel {

	public String updatedon;
	public int itemsPerPage;
	public ArrayList<ExsodeModel> exsode;

	public WricModel(String updatedon, int itemsPerPage, ArrayList<ExsodeModel> exsode) {

		this.updatedon = updatedon;
		this.itemsPerPage = itemsPerPage;
		this.exsode = exsode;

	}

}