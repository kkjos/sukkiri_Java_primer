
public class VariableDeclration {
	public static void main(String[] args) {
		final double PI = 3.14;

		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は" + pie * pie * PI);

		pie = 10;
		System.out.println("半径" + pie + "cmのパイの面積は" + pie * pie * PI);
	}
}
