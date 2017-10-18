
public abstract class Character {

	String name;
	int hp;
	
	public Character(String name1) {
		// TODO Auto-generated constructor stub
		this.name = name1;
	}
	
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した");
	}

	public abstract void attack(Matango m);
	
}
