package chapter3;

public class do_while {
	public static void main(String[] args) {
		int temp = 24;
		do {
			temp--;
			System.out.println("温度を１度下げました");
		} while (temp > 25);
		System.out.println(temp);
	}
}
