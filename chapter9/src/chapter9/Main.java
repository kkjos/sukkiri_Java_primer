package chapter9;

public class Main {
	public static void main(String[] name) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);

		Hero h1 = new Hero();
		h1.name = "アサカ";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "スガワラ";
		h2.hp = 50;
		Wizard w = new Wizard();
		w.name = "ミナト";
		w.hp = 100;
		w.heal(h1);
		w.heal(h2);
	}
}
