package chapter12;

public class Main {
	public static void main(String[] args) {

		Slime s = new Slime();
		Character c = new Slime();
		
		// 多様性は型（左）にインスタンス（右）を代入する。
		// Slimeクラスのみのメソッドである場合呼び出すことはできないが、親インスタンスにもメソッドが存在し呼び出せる場合に限り以下の動きをする

		// スライム型のスライムインスタンス
		s.run();
		// キャラクター型のスライムインスタンス
		c.run();
		// 実行結果は同じになる
		
	}
}
