package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//P class의 method를 사용 
		//제공되는 메서드를 사용할 때 확인할 내용
		//1. static이 붙었는지 안 붙었는지 확인하고 그에 따라 인스턴스 생성은 어떻게 해야할지와 매개변수는 어떤 자료형이고 몇개나 되는지 또 return티입은 어떻게 되는지 
		P obj = new P();
		
		obj.method();
		
		System.out.println("---------------------------------------------");
		//P클래스릐 method의 기능이 부독하다고 파단되면 P클래스를 상속받는 클래스를 생성 - C
		//C 클래스의 기능이 부족하다고 판단된 메서드를 재정의 
		C obj_c = new C();
		obj_c.method();
		
		
		//P가 상위 클래스 C가 하위 클래스 
		P p = new P(); //클래스와 인스턴스 타입이 같으면 대입이 가능
		p = new C(); //인스턴스의 타입이 변수의 클래스의 하위 클래스이면 가능 
		
		C c = new C();
//		c = new P(); C가 P클래스의 하위 클래스이기 때문에 에러 
		
//		c = (C)(new P()); 강제로 형 변환을 하면 에러는 아니지만 예외가 발생 
		c = (C)p; //예외 발생하지 않음 - p에는 C()가 대입되어 있어서 가
		
	}

}
