package practice11;

public class Computer extends TangibaleAssets {
	String isbn;

	public Computer(String name, int price, String color, String isbn) {
		super(name, price, isbn);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}
}
