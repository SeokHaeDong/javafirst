package polymorphism;

public class Zerg extends Starcraft{
	@Override
	public void attack() {
		super.attack();
		System.out.println("저그의 공격");
	}
}
