import junit.framework.TestCase;

//TestCase 상속받는 클래스 이용 
public class Test1 extends TestCase {
	public void test() {
		System.out.println(new Sample().intAddWithInt(100, 300));
	}
}
