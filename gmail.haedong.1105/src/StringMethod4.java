
public class StringMethod4 {
	public static void main(String[] args) {
		int x = 10;
		int y = 200;
		//3자리씩 확보해서 오른쪽 맞
		System.out.printf("%3d\n",x);
		System.out.printf("%3d\n",y);
		
		// 빈자리에 0을 삽
		System.out.printf("%03d\n",x);
		System.out.printf("%03d\n",y);
		
		//소수 2번째 까지 출력, 3번째 자리에서 반올
		double d = 12.3453435345;
		System.out.printf("%.2f\n",d);
		
		//문자열로 생성
		String message = String.format("%.2f\n", d);
		//출력
		System.out.println(message);
		
		
	}
}
