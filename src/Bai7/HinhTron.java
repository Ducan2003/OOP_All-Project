package Bai7;

public class HinhTron {
	private ToaDo Tam;
	private float bankinh;
	private double chuvi;
	private double dientich;
	public HinhTron(float bankinh, double chuvi, double dientich, ToaDo tam, double banKinh) {
		super();
		this.bankinh = bankinh;
		this.chuvi = chuvi;
		this.dientich = dientich;
		this.Tam = tam;
		this.bankinh = bankinh;
	}
	public ToaDo getTam() {
		return Tam;
	}

	public void setTam(ToaDo tam) {
		this.Tam = tam;
	}
	public float getBankinh() {
		return bankinh;
	}
	public void setBankinh(float bankinh) {
		if (bankinh <= 0)
			this.bankinh = 0;
		else
			this.bankinh = bankinh;
	}
	public double getChuvi() {
		return chuvi;
	}
	public void setChuvi(double chuvi) {
		this.chuvi = (2 * bankinh * 3.14);
	}
	public double getDientich() {
		return dientich;
	}
	public void setDientich(double dientich) {
		this.dientich = (bankinh * bankinh * 3.14);
	}
}
