
public class Derived extends Based {
	/*
	 * public Derived() { super(); // new Based(); }
	 */
	
	//상위 클래스에 매개변수가 없는 생성잘가 없어서 생성자를 만들고 상위 클래스의 생성자를 직접 호출 
	//상위 클래스에서 매개변수가 1개인 생성자를 만들었기 때문에 하위 클래스에서 생성자를 호풀하지 않으면 에러가 발생한다 
	public Derived(int n)
	{
		super(1);
	}
	
	
}
