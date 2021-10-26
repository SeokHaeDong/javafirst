
public class DoubleError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + 1;
		}
		System.out.println(sum);
		
		//정수로 연산 수 형변환을 이용하여 실수로 돌려준다??
		
		double d_sum = 0.0;
		for (int i = 0; i < 100; i++) {
			d_sum += 0.1;
		}
		System.out.println(d_sum);
		
		
		
		
//		double a = 0.2;
//		double b = 1.0 ;
//		double c = 0.8;
//		double result = b - c;
		System.out.println(0.2 == (1.0-0.8));
		
		
	}

}
