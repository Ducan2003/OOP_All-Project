package Bai9;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
public class ListofEmployees {
	private ArrayList<CongNhan>DanhsachCN;
	
	public ListofEmployees(ArrayList<CongNhan> danhsachCN) {
		DanhsachCN = danhsachCN;
	}

	public ListofEmployees() {
		this.DanhsachCN = new ArrayList<CongNhan>();
	}
	
	// Add employees method
	public void addEmployees(CongNhan empl){
		this.DanhsachCN.add(empl);
		}
	
	// Print Employees List
	public void InmangCN() {
		for (CongNhan cd : DanhsachCN) {}
		System.out.println(DanhsachCN);
	}
	// Count the number of Employees
	public void CountNumber() {
		int temp = 0;
		for (CongNhan i : DanhsachCN) {
			if (i != null)
				temp++;}
		System.out.println(temp);
	}
	public String Over200() {
		String s= "";  
		for (int i = 0; i < DanhsachCN.size(); i++) {
			  if (DanhsachCN.get(i).getnumberofProducts() > 200)
				  s += DanhsachCN.get(i);
			  System.out.println("Thong tin nhan vien: " +s);
		}
		return s;
	}
	@Override
	public String toString() {
		return "ListofEmployees [DanhsachCN=" + DanhsachCN + "]";
	}

}
