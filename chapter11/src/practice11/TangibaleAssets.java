package practice11;

public abstract class TangibaleAssets {
	String name;
	int price;
	String color;

	public void TangibaleAseets(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public String getColor() {
		return this.color;
	}
}
