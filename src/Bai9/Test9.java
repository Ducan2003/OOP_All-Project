package Bai9;

import java.util.Scanner;

public class Test9 {
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); {
		ListofEmployees LoE = new ListofEmployees();
		int luachon = 0;
		do {
			System.out.println("Nhap vao lua chon cua ban: ");
			System.out.println("1. Them cong nhan vao danh sach\n"
							   +"2. Xuat toan bo thong tin nhan vien\n"
							   + "3. Tinh so luong nhan vien\n"
							   + "4. Xuat thong tin nhan vien lam tren 200 san pham\n"
							   + "5. Tinh luong\n"
							   + "0. Thoat\n");
			luachon = sc.nextInt();
			if (luachon == 1) {
				System.out.println("Nhap vao id cong nhan: \n");
				int employeesID = sc.nextInt();
				System.out.println("Nhap vao ten cong nhan: \n");
				String name = sc.nextLine();
				System.out.println("Nhap id san pham: \n");
				int productID = sc.nextInt();
				System.out.println("Nhap vao so luong san pham: \n");
				int numberofProducts = sc.nextInt();
				CongNhan empl = new CongNhan(employeesID, name, productID, numberofProducts);
				LoE.addEmployees(empl);
			}else if (luachon == 2) {
				//LoE.InmangCN();
				LoE.InmangCN();}
			else if (luachon == 3) {
				LoE.CountNumber();}
			else if (luachon == 4) {
				LoE.Over200();}
		}while (luachon != 0);}
	}
}


















/*ListofEmployees LoE = new ListofEmployees(null);
int luachon;
do {
	
sc.nextLine();
if (luachon == 1 ) {
	System.out.println("Nhap vao id cong nhan: \n");
	int employeesID = sc.nextInt();
	System.out.println("Nhap vao ten cong nhan: \n");
	String name = sc.nextLine();
	System.out.println("Nhap id san pham: \n");
	int productID = sc.nextInt();
	System.out.println("Nhap vao so luong san pham: \n");
	int numberofProducts = sc.nextInt();
	CongNhan empl = new CongNhan(employeesID, name, productID, numberofProducts);
}else if (luachon == 2) {
		LoE.InmangCN();
}else if (luachon == 3) {
	LoE.CountNumber();
}else if (luachon == 4) {
	LoE.Over200(luachon, null);
	}	
}while (luachon != 0);
}*/