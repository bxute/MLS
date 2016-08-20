import java.util.ArrayList;

class WrappersModel {

	public String redeem;
	public int itemsPerPage;
	public ArrayList<ReckleModel> reckle;

	public WrappersModel(String redeem, int itemsPerPage, ArrayList<ReckleModel> reckle) {

		this.redeem = redeem;
		this.itemsPerPage = itemsPerPage;
		this.reckle = reckle;

	}

}