package Bai8;

public class CDTest {
	private int id;
	private String name;
	private int numberofSong;
	private float price;

	public CDTest() {
		this.id = 999999;
		this.name = "Chua xac dinh";
		this.numberofSong = 1;
		this.price = 1;
	}

	public CDTest(int id, String name, int numberofSong, float price) {
		super();
		this.id = id;
		this.name = name;
		this.numberofSong = numberofSong;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0)
			this.id = id;
		else
			this.id = 999999;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberofSong() {
		return numberofSong;
	}

	public void setNumberofSong(int numberofSong) {
		if(numberofSong > 0)
			this.numberofSong = numberofSong;
		else this.numberofSong =1;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if(price > 0)
			this.price = price;
		else 
			this.price =1;
	}

	@Override
	public String toString() {
		return "CDTest [id=" + id + ", name=" + name + ", numberofSong=" + numberofSong + ", price=" + price + "]";
	}

}
