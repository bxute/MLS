import java.util.ArrayList;

class WricModel {

	public String updatedon;
	public ArrayList<ExsodeModel> exsode;
	public int itemsPerPage;

	public WricModel(String updatedon, ArrayList<ExsodeModel> exsode, int itemsPerPage) {

		this.updatedon = updatedon;
		this.exsode = exsode;
		this.itemsPerPage = itemsPerPage;

	}

}