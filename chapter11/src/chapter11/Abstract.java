package chapter11;

public class Abstract {
	// メソッド内に詳細未定の記述がある場合
	public abstract void attack(Mantago m);
	// public abstract 戻り値 メソッド(引数);
}

//クラスはnew・継承を選べるため、newのインスタンス化を禁止
public abstract class Character {}
// public abstract class クラス名{}
