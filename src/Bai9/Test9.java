package Bai9;

import java.util.Scanner;


public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		{
			CDList l = new CDList();
			int luachon;
			do {
				System.out.println("Nhap vao lua chon: ");
				System.out.println("1. Nhap CD\n" 
						+ "2. In ra man hinh\n" 
						+ "3. Tinh so luong\n"
						+ "4. Tinhtonggiathanh\n"
						+ "5. Sap xep tang dan\n" 
						+ "0. Thoat");
				luachon = sc.nextInt();
				sc.nextLine();
				if (luachon == 1) {
					System.out.println("Nhap vao id CD:");
					int id = sc.nextInt();
					System.out.println("Nhap vao ten CD: ");
					String name = sc.nextLine();
					System.out.println("Nhap vao so bai hat: ");
					int musicno = sc.nextInt();
					System.out.println("Nhap vao gia: ");
					float price = sc.nextFloat();
					CDTest ds = new CDTest(id, name, musicno, price);
					l.ThemCD(ds);
				} else if (luachon == 2) {
					l.InmangCD();
				} 
				else if (luachon == 3){
					System.out.println("So luong bai hat: ");
					l.Tinhsoluong();
					}
				else if (luachon == 4) {
					l.tinhTongGiaThanhCD();
				}
				else if (luachon == 5) {
					l.Sapxep();
				}
			} while (luachon != 0);
		}
	}
}