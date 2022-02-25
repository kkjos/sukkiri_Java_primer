package practice5;

public class practice5_4 {
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double calcTriangleArea = calcTriangleArea(bottom, height);
		System.out.println("三角形の底辺が" + bottom + "高さは" + height + "面積は" + calcTriangleArea);

		double radius = 5.0;
		double calcCircleArea = calcCircleArea(radius);
		System.out.println("縁の半径が" + radius + "面積は" + calcCircleArea);
	}

	public static double calcTriangleArea(double bottom, double height) {
		double ans = bottom * height / 2;
		return ans;
	}

	public static double calcCircleArea(double radius) {
		double ans = radius * radius * 3.14;
		return ans;
	}
}
