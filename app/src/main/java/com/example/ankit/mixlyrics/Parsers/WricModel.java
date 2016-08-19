import java.util.ArrayList;

class WricModel {

	public int itemsPerPage;
	public String updated;
	public ArrayList<RemedeModel> remede;

	public WricModel(int itemsPerPage, String updated, ArrayList<RemedeModel> remede) {

		this.itemsPerPage = itemsPerPage;
		this.updated = updated;
		this.remede = remede;

	}

}