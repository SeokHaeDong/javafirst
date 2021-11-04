import java.math.BigDecimal;

public class DoubleAccuracy {
	public static void main(String[] args) {
		double d1 = 1.60000000000000000;
		double d2 = 0.10000000000000000;
		//소수의 정밀도 때문에 이상한 결과가 나온다 
		System.out.println(d1 + d2);
		
		
		//숫자로 저정하지 않고 문자열로 가지고 있다가 계산을 할때 숫자로 변경해서 계산하기 때문에 정밀도 상관없이 정확한 계산을 수행 
		BigDecimal bd1 = new BigDecimal("1.60000000000000000");
		BigDecimal bd2 = new BigDecimal("0.10000000000000000");
		
		System.out.println(bd1.add(bd2));
	}
}
