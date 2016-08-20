import java.util.ArrayList;

class WricModel {

	public int itemsPerPage;
	public String updatedon;
	public ArrayList<ExsodeModel> exsode;

	public WricModel(int itemsPerPage, String updatedon, ArrayList<ExsodeModel> exsode) {

		this.itemsPerPage = itemsPerPage;
		this.updatedon = updatedon;
		this.exsode = exsode;

	}

}