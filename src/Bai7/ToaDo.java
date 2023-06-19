package Bai7;

public class ToaDo {
	private String Ten;
	private float x,y;
	public ToaDo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ToaDo(String ten, float x, float y, float bankinh, double chuvi, double dientich) {
		super();
		Ten = ten;
		this.x = x;
		this.y = y;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		if (ten != null)
			this.Ten = ten;
		else
			this.Ten = "xxx";
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
}
