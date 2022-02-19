package practice13;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int) (basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した");
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int Hp) {
		this.hp = hp;
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}

}
