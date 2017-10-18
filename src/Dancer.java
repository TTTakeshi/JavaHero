
public class Dancer extends Character {

	public Dancer(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	public void dance() {
		System.out.println(this.name + "は、情熱的に踊った");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に３ポイントのダメージを与えた");
		m.hp -= 3;
	}
	
}