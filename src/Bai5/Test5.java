package Bai5;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Test5 {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		HangThucPham tester1 = new HangThucPham("001", "Sua", 300000, LocalDate.of(2018, 9, 10),
				LocalDate.of(2018, 7, 19));
		HangThucPham tester2 = new HangThucPham("002", "Nuoc ngot", 10000, LocalDate.of(2018, 9, 30), LocalDate.of(2018, 9, 1));
		HangThucPham tester3 = new HangThucPham("003", "Gao", 150000, LocalDate.of(2022, 3, 1),
				LocalDate.of(2018, 3, 1));
		System.out.println(String.format("%-10s %-10s %15s %-20s %-20s %-15s","Mã_Hàng","Tên_Hàng","Đơn_Giá","Ngày_Sản_Xuất","Ngày_Hết_Hạn","Ghi_Chú"));
		System.out.println("===============================================================================");
		System.out.println(tester1.toString());
		System.out.println(tester2.toString());
		System.out.println(tester3.toString());
	}
}

