package chapter13;

/*
 * カプセル化とは未然にヒューマンエラー等のミスを防ぐためのもの
 * アクセス修飾子４種（アクセス許可範囲）
 * private　　（自身のクラスのみ）
 * package private　　（自身と同じパッケージに属するクラス）
 * protected　　（自身と同じパッケージに属するか自分を継承した小クラス）
 * public　　（全てのクラス）
 */
public class Capsule {
	//　フィールド
	private int hp;
	
	// メソッド
	private void die() {
	}
}
