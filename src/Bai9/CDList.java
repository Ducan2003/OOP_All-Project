package Bai9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CDList {
	int Sum = 0;
	private ArrayList<CDTest> DanhsachCD;
	
	public CDList(ArrayList<CDTest> danhsachCD) {
		DanhsachCD = danhsachCD;
	}
	public CDList () {
		this.DanhsachCD = new ArrayList<CDTest>();
	}
	public void ThemCD(CDTest ds) {
			this.DanhsachCD.add(ds);
	}
	public void InmangCD() {
		for (CDTest cd : DanhsachCD) {
			System.out.println(DanhsachCD);
		}
	}
	public void Tinhsoluong() {
		int temp = 0;
		for (CDTest i : DanhsachCD) {
			if (i != null)
				temp++;
		}
		System.out.println(temp);
	
	}
	public void tinhTongGiaThanhCD() {
		double tong = 0;
		for (CDTest i : DanhsachCD) {
			if (i != null)
				tong += i.getPrice();
		}
		System.out.println(tong);
	}
	@SuppressWarnings("unchecked")
	public void Sapxep() {
		this.DanhsachCD.sort((Comparator<? super CDTest>) DanhsachCD);
	}
	@Override
	public String toString() {
		return "CDList [Sum=" + Sum + ", DanhsachCD=" + DanhsachCD + "]";
	}
}


