
public class VariableDeclration {
	public static void main(String[] args) {
		// 定数宣言
		final double PI = 3.14;

		// 変数宣言
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は" + pie * pie * PI);

		// 再宣言
		pie = 10;
		System.out.println("半径" + pie + "cmのパイの面積は" + pie * pie * PI);
	}
}
