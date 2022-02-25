package practice5;

public class practice5_2 {
	public static void main(String[] args) {
		String title = "こんにちは";
		String address = "aaa@aaa";
		String text = "明日よろしくお願いします";
		email(title, address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールを送信いたしました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
