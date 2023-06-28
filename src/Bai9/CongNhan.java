package Bai9;

public class CongNhan {
	private int employeesID;
	private String name;
	private int productID;
	private int numberofProducts;
	
	
	//Constructor
	public CongNhan() {
		// TODO Auto-generated constructor stub
	}
	public CongNhan(int employeesID, String name, int productID, int numberofProducts) {
		super();
		this.employeesID = employeesID;
		this.name = name;
		this.productID = productID;
		this.numberofProducts = numberofProducts;
	}
	
	//Getter/setter methods 
	public int getEmployeesID() {
		return employeesID;
	}
	public void setEmployeesID(int employeesID) {
		if (employeesID > 0)
			this.employeesID = employeesID;
		else
			this.employeesID = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		if (productID > 0)
			this.productID = productID;
		else
			this.productID = 0;
	}
	public int getnumberofProducts() {
		return numberofProducts;
	}
	public void setnumberofProducts(int numberofProducts) {
		if (numberofProducts > 0)
			this.numberofProducts = numberofProducts;
		else
			this.numberofProducts = 0;
	}
	public double dongia() {
		double price;
		if (numberofProducts >= 1 && numberofProducts<=199) {
			price = 0.5;
		}else if (numberofProducts >= 200 && numberofProducts <= 399) {
			price = 0.55;
		}else if (numberofProducts >= 400 && numberofProducts <= 599){
			price = 0.6;
		}else
			price = 0.65;
		return price;
	}
	
	// salary method
	public void calSalary() {
		double Salary;
		Salary = numberofProducts * dongia();
			System.out.println("Luong" +Salary);
	}
	@Override
	public String toString() {
		return "CongNhan [employeesID=" + employeesID + ", name=" + name + ", productID=" + productID
				+ ", numberofProducts=" + numberofProducts + ", dongia()=" + dongia() + "]";
	}
	
}

