
class PricemModel {

	public String type;
	public Boolean required;
	public int minimum;

	public PricemModel(String type, Boolean required, int minimum) {

		this.type = type;
		this.required = required;
		this.minimum = minimum;

	}

}