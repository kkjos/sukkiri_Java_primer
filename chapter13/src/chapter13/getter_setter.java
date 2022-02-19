package chapter13;

/*
 * メンバに関するアクセス修飾子の定石
 * ・フィールドは全てprivate
 * ・メソッドは全てpublic
 * 上記でコードを書き、必要な部分（メソッド）だけアクセス修飾子を書き換える
 * 
 * フィールドをprivateにすると外部から取り出せないといった問題が起こる。
 * 考え方→メソッドから取り出す。
 */

public class getter_setter {
	private String name;
	
	public String getName(String name) {
		return this.name;
	}
	//呼び出し先でgetNameメソッドを使用する
	
	public void setName(String name) {
		this.name = name;
	}
}
