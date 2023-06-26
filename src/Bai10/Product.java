package Bai10;

public class Product {
	private String description;
	private String productID;
	public double price;
	
	// Constructor
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String description, String productID, double price) {
		super();
		this.description = description;
		this.productID = productID;
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%-10s %-10s %15s ", this.description.toString(), 
				this.productID.toString() ,"price=" + price );
	}
}
