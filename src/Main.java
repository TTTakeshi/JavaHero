
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		Hero h = new Hero("みなと");
//		h.name = "みなと";
//		h.hp = 100;
		h.sword = s;
		
		System.out.println("勇者" + h.name + "を生み出しました!");
		System.out.println("HPは、" + h.hp);
		System.out.println("現在の武器は" + h.sword.name);
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 40;
		m2.suffix = 'B';
		
		// 冒険の始まり
		h.sit(5);
		m1.run();
		m2.run();
		
		Wizard w = new Wizard();
//		w.name = "スガワラ";
		w.heal(h);
		
		SuperHero sHero = new SuperHero("test");
		sHero.sit(10);
		sHero.attack(m1);
		
//		Character character1 = new Character();
		Dancer dancer1 = new Dancer("adb");
		dancer1.attack(m1);
		
	}

}
