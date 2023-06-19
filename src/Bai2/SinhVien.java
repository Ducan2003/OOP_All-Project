package Bai2;

public class SinhVien {
	private int maSV;
	/**
	* Họ và tên của sinh viên
	*/
	private String hoTen;
	/**
	* Điểm lý thuyết
	*/
	private float diemLT;
	/**
	* Điểm thực hành
	*/
	private float diemTH;
	/**
	* Default constructor của lớp SinhVien
	*/
	public SinhVien() {
	this(0, "", 0.0f, 0.0f);
}
	public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemLT(diemTH);
		}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		if (maSV < 0)
		this.maSV = 0;
		else
		this.maSV = maSV;
		}
	public String getHoTen() {
		return hoTen;
		}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
		}
	public float getDiemLT() {
		return diemLT;
		}
	public void setDiemLT(float diemLT) {
		if (diemLT >= 0 && diemLT <= 10)
		this.diemLT = diemLT;
		else
		this.diemLT = 0;
		}
	public float getDiemTH() {
		return diemTH;
		}
	public void setDiemTH(float diemTH) {
		if (diemTH >= 0 && diemTH <= 10)
		this.diemTH = diemTH;
		else
		this.diemTH = 0;
		}
	public float getDiemTB() {
		return (diemLT + diemTH)/2;
		}
	@Override
	public String toString() {
	return String.format("%-5s %-30s %10.2f %10.2f %10.2f", maSV, hoTen,
	diemLT, diemTH, getDiemTB());
	}
	
}
