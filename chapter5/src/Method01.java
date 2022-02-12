
public class Method01 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello(); // helloメソッドの呼び出し
		System.out.println("メソッドの呼び出しを終了します");
		methodA();// methodAの呼び出し
	}

	public static void hello() {
		System.out.println("こんにちは");
	}

	public static void methodA() {
		methodB(); // methodBの呼び出し
	}

	public static void methodB() {
		System.out.println("methodB");
	}
}
