package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Starcraft  star = new Protoss();
		star.attack();
		
		star = new Terran();
		star.attack();
		
		star = new Zerg();
		star.attack();
		
	}

}
