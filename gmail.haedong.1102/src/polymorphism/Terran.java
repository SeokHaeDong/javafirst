package polymorphism;

public class Terran extends Starcraft {
	@Override
	public void attack() {
		super.attack();
		System.out.println("테란의 공격");
	}
}
