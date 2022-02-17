package chapter11;

// interfaceを使う理由
// 従来の継承では多重継承ができないー>複数の継承が可能

// 構文
// 1.フィールドがない場合（定数は条件外）メソッドのみである場合
public interface Interface {}
//public interface インターフェイス名

// 2.メソッドの書き方
public interface Interface {
	// public abstract void run();　以下に省略可能
	void run();
}

// 3.定数のフィールドの場合
public interface Circle{
	double PI = 3.14;
}

// 4. 子クラスで継承する場合の宣言
public class Hero implements Character{}
// public class クラス名 implements インターフェイス名{}

// 5.多重継承
public class Hero implements Character, Human{}
// punlic class クラス名 implements インターフェイス１, インターフェイス２

// ※注意点　継承下・継承先の条件によりimplements部が変わる
// 1.クラス→クラス　インターフェイス→インターフェイス　　＝＞　extends
// 2.インターフェイス→インターフェイス　　＝＞implements

// 同時に行う場合もある
public class Fool extends Character implements Human{}
//  public class クラス名 extend 親クラス implements インターフェイス名{}