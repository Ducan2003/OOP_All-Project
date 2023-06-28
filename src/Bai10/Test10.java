package Bai10;

import java.time.LocalDate;

public class Test10 {
	public static void main(String[]  args) throws Exception {
		Order o1 = new Order();
		o1.setOrderID(21102991);
		//o1.setLineItems(o1);
		OrderDetail od1 = new OrderDetail();
		od1.setProduct("Gao");;
		od1.setQuality(3);
		od1.calcTotalPrice(3, 12.000);
		od1.calcTotalCharge(12.000);
		Product pr1 = new Product();
		Product pr2 = new Product();
		Product pr3 = new Product();
		pr1.setDescription("Nuoc Tuong");
		pr2.setDescription("Nuoc ngot");
		pr3.setDescription("Gao");
		pr1.setProductID("Nt");
		pr2.setProductID("nn");
		pr3.setProductID("g");
		pr1.setPrice(8.000);
		pr2.setPrice(12.000);
		pr3.setPrice(18.000);
		System.out.println(o1.toString());
		System.out.println("Ngay lap hoa don: " +LocalDate.of(2012, 9, 18));
		System.out.println(String.format("%-20s %-10s %-10s %15s %-20s ", "STT", "Tensp", "Masp", "Mo Ta", "Don Gia"));
		System.out.println("===============================================================================");
		System.out.println(od1.toString());
		System.out.println(pr1.toString());
		System.out.println(pr2.toString());
		System.out.println(pr3.toString());
	}
}

