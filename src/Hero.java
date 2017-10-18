
public class Hero {
	
	String name;
	int hp;
	
	Sword sword;
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した！");
		
	}
	
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！!");
	}

	public void attack(Matango m) {
		System.out.println(this.name + "は攻撃した！");
		m.hp -= 5;
		System.out.println("敵に5ポイントのダメージを与えた！!");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

	public Hero(String name) {
		// TODO Auto-generated constructor stub
		this.hp = 100;
		this.name = name;
	}

	public Hero() {
		// TODO Auto-generated constructor stub
		this.hp = 100;
		this.name = "Dummy";
	}

}
