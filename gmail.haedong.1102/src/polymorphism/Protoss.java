package polymorphism;

public class Protoss extends Starcraft {
	
	@Override
	public void attack() {
		super.attack();
		System.out.println("프로토스의 공격");
	}
}
