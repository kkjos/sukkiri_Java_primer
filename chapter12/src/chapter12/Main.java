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

		// ダウンキャスト
		// スライムクラスのみのメソッド jump
		s.jump();
		// キャラクター型のスライムを同様に動かそうとするとエラーが起きるので以下記述で強制的に捉え直す。
		Slime s2 = (Slime) c;
		// 型名 変数 = (型名)別型インスタンス;
		s2.jump();
		// この方法はあくまで代入しても矛盾が生まれないのが前提。以下記述が代入可能かチェックする。
		if (c instanceof Slime) {
			Slime s3 = (Slime) c;
		}
		// if (変数名 instanceof 型名){型名 変数 = (型名)別型インスタンス;}
	}
}
