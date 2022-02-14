
public class Main {
	public static void main(String[] args) {
		// 勇者よ、この仮想世界に生まれよ
		Hero h = new Hero();
		h.name = "minato";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました");
		
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		// お化けきのこよ、この仮想世界に生まれよ
		// 勇者よ、戦え
		// お化けきのこよ、逃げろ
	}
}
