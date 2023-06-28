package Bai10;

import java.time.LocalDate;

public class Order {
	private int orderID; 
	private LocalDate orderDate;
	private Order lineItems;
	private int count;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(int orderID, LocalDate orderDate, Order lineItems, int count) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.lineItems = lineItems;
		this.count = count;
	}
	public void addLineItem(Product i, int x) {
		lineItems.addLineItem(i, x);
	}
	public double calcTotalChargr() {
		return 0;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public Order getLineItems() {
		return lineItems;
	}
	public void setLineItems(Order lineItems) {
		this.lineItems = lineItems;
	}
	@Override
	public String toString() {
		return "Ma HD: " + orderID  + orderDate;
	}
}
