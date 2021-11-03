package singleton;

public class Main {
	public static void main(String[] args) {
		/*
		 * BusinessLogic obj = new BusinessLogic(); BusinessLogic obj1 = new
		 * BusinessLogic();
		 */
		
		//싱글톤 패턴으로 디자인 된 클래스라서 생성자로 인스턴스 생성을 못하고 static 메서드를 호출해서 인스턴스를 생성
		BusinessLogic obj1 = BusinessLogic.sharedInstance();
		BusinessLogic obj2 = BusinessLogic.sharedInstance();
		
//		BusinessLogic obj2 = obj;
		
//		System.out.println(obj == obj1);
//		System.out.println(obj == obj2);
		
//		System.out.println(System.identityHashCode(obj));
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
	}
}
