package practice10;

public class PoisonMatango extends Matango {
	int poisonCount = 5;

	public void Attack(Hero h) {
		super.attack(h);
		if (this.poisonCount > 0) {
			System.out.println("毒攻撃");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ");
			this.poisonCount--;
		}
	}
}
