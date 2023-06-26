package Bai10;

public class OrderDetail {
	private int quality;
	private String product;
	
	// Constructor OrderDetail
	public OrderDetail( String product, int quality) {
		this.product = product;
	}
	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}
	// calcTotalPrice method
	public double calcTotalPrice(int quality, double price) {
		double TotalPice;
		return  TotalPice= quality * price;
	}
	public double calcTotalCharge (double TotalPrice) {
		double TotalCharge;
		return TotalCharge = TotalPrice + TotalPrice;
	}
	
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	//Get/Set quality 
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	@Override
	public String toString() {
		return String.format("%-10s %-10s %20s ", this.product.toString(), 
				this.quality, this.calcTotalCharge(calcTotalPrice(quality, quality)));
	}
	
	
}
