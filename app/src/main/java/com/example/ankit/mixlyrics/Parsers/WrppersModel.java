import java.util.ArrayList;

class WrppersModel {

	public String updated;
	public int itemsPerPage;
	public ArrayList<ExpressModel> express;

	public WrppersModel(String updated, int itemsPerPage, ArrayList<ExpressModel> express) {

		this.updated = updated;
		this.itemsPerPage = itemsPerPage;
		this.express = express;

	}

}