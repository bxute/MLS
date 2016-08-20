import java.util.ArrayList;

class WrappersModel {

	public ArrayList<ReckleModel> reckle;
	public int itemsPerPage;
	public String redeem;

	public WrappersModel(ArrayList<ReckleModel> reckle, int itemsPerPage, String redeem) {

		this.reckle = reckle;
		this.itemsPerPage = itemsPerPage;
		this.redeem = redeem;

	}

}