import java.util.ArrayList;

class WrappersModel {

	public int itemsPerPage;
	public String redeem;
	public ArrayList<ReckleModel> reckle;

	public WrappersModel(int itemsPerPage, String redeem, ArrayList<ReckleModel> reckle) {

		this.itemsPerPage = itemsPerPage;
		this.redeem = redeem;
		this.reckle = reckle;

	}

}