package Bai5;


import java.time.LocalDate;
import java.text.DecimalFormat;

public class HangThucPham<Compare> {
	private String Mahang;
	private String Tenhang;
	private double Dongia;
	private LocalDate Ngaysx, Ngayhethan;
	
	public boolean Kiemtratenhang;

	//Constructor
	public HangThucPham() {
		super();
		// TODO Auto-generated constructor stub
		}

	public HangThucPham(String mahang, String tenhang, double dongia, LocalDate ngaysx, LocalDate ngayhethan) {
		super();
		Mahang = mahang;
		Tenhang = tenhang;
		Dongia = dongia;
		Ngaysx = ngaysx;
		Ngayhethan = ngayhethan;
	}


	// Get/Set methods
	public String getMahang() {
		return Mahang;
	}

	public void setMahang(String mahang) {
	}

	public String getTenhang() {
		return Tenhang;
	}

	public void setTenhang(String tenhang) {
		if (tenhang != null)
			this.Tenhang = tenhang;
		else
			this.Tenhang = "xxx";
	}

	public double getDongia() {
		return Dongia;
	}

	public void setDongia(double dongia) {
		if (dongia >= 0)
			this.Dongia = dongia;
	}

	public LocalDate  getNgaysx() {
		return Ngaysx;
	}

	public void setNgaysx(LocalDate ngaysx) {
		if (ngaysx.isBefore(LocalDate.now()))
			this.Ngaysx = ngaysx;
		else 
			this.Ngaysx = LocalDate.now()
;	}

	public LocalDate getNgayhethan() {
		return Ngayhethan;
	}

	public void setNgayhethan(LocalDate ngayhethan) {
		if (ngayhethan.isAfter(LocalDate.now()))
			this.Ngayhethan = ngayhethan;
		else
			this.Ngayhethan = LocalDate.now();
	}
	
	public void Thucpham(String Mahang , String Tenhang, double Dongia, LocalDate ngaysx, LocalDate ngayhethan) throws Exception {
		if (Mahang != null)
			this.Mahang = Mahang;
		else
			throw new Exception("Lỗi: Mã hàng rỗng!");
		setTenhang(Tenhang);
		setDongia(Dongia);
		setNgaysx(ngaysx);
		setNgayhethan(ngayhethan);
	}

	public HangThucPham(String Mahang) throws Exception {
		if (Mahang != null)
			this.Mahang = Mahang;
		else
			throw new Exception("Lỗi: Mã hàng rỗng!");
	}
	public String checkHsd() {
		if (Ngayhethan.isBefore(LocalDate.now()))
			return "Hàng hết hạn";
		else
			return "";
	}
	
	@Override
	public String toString() {
		DecimalFormat fm = new DecimalFormat("###,###.00VND");
		return String.format("%-10s %-10s %15s %-20s %-20s %-15s", this.Mahang, this.Tenhang, fm.format(this.Dongia),
				Ngaysx.toString(), Ngayhethan.toString(), this.checkHsd());
	}
}
 
	

	