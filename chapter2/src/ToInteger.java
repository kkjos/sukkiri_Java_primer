
public class ToInteger {
	public static void main(String[] args) {
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("私は現在" + age + "歳で");
		System.out.println("来年、" + (n + 1) + "歳になります");

		// 変換なし
		System.out.println("来年、" + (age + 1) + "歳になります");
	}
}
