
import org.junit.Assert;
import org.junit.Test;

public class Test3 {
	@Test	//Annotation  이용
	public void test() {
		int result = new Sample().intAddWithInt(100, 200);
		int i = 300;
		//두개의 값이 같으면 정상 종료 되지만 다르면 예외가 발생 
		Assert.assertEquals(result, i);
	}
}
