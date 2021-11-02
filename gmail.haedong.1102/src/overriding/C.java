package overriding;

public class C extends P {
	//메서드 오버라이딩
	//상위 클래스에 있는 메서드를 하위 클래에서 다시 만드는 것 
	
	@Override
	public void method() {
			//상위 클래스의 메서드를 호출()
			super.method();
			System.out.println("하위 클래스에서 새롭게 추가한 기능");
	}
}
