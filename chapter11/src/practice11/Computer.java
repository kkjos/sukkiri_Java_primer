package practice11;

public class Computer {
	String name;
	int price;
	String color;
	String isbn;

	public void Book(String name, int price, String color, String isbn) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.isbn = isbn;
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

	public String getIsbn() {
		return this.isbn;
	}
}
