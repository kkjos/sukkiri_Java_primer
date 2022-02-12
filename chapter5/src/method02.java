
public class method02 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊");
		add(100, 20);
		System.out.println("メソッドの呼び出しを終了します");
	}

	public static void hello(String name) {
		System.out.println(name + "こんにちは");
	}

	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}
