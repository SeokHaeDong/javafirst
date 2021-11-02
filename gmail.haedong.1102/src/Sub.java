//Super class를 상속 받은 sub class 
public class Sub extends Super {
	public void subMethod() {
		// 상위클래스의 private 멤버는 하위 클래스에서 접근이 안됨
		// privateMethod();

		// 상위 클래스의 package 멤버는 동일한 패키지면 접근이 가능함
		packageMethod();

		// 상위 클래스의 prdtected멤버는 하위 클래스에서 무조건 접근이 가능
		protectedMethod();

		// 상위 클래스의 public 멤버는 하위 클래스에서 접근이 가능
		publicMethod();
	}
}
