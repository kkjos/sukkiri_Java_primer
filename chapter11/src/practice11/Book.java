package practice11;

public class Book extends TangibaleAssets {
	String makerName;

	public Book(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	public String getMakerName() {
		return this.makerName;
	}
}
