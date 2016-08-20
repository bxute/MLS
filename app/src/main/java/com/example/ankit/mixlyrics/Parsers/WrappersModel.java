import java.util.ArrayList;

class WrappersModel {

	public ArrayList<ReckleModel> reckle;
	public String redeem;
	public int itemsPerPage;

	public WrappersModel(ArrayList<ReckleModel> reckle, String redeem, int itemsPerPage) {

		this.reckle = reckle;
		this.redeem = redeem;
		this.itemsPerPage = itemsPerPage;

	}

}