
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 10 + 20;
		System.out.println("result : " + result);

		// 문자열 + 숫자는 문자열의 결합으로 리턴
		String str = "10" + 20;
		System.out.println("str : " + str);

		// 정수/정수 ==> 정수끼리 연산 하면 결과는 정수이다
		result = 10 / 3;
		System.out.println("rsult : " + result);

		// 정수/ 정수 한 결과를 소수까지 구하고자 한다면 둘 중 하나의 데이터를 실수로 형변환 하여 연산
		System.out.println("result : " + (10 / (double) 3));
		System.out.println("result : " + ((double) 10 / 3));

		byte b = 30;
		byte c = 20;
		// 산술연사의 결과는 최소한 int, int는 byte보다 크므로 대입이 안된다
//		byte d = b + c;
		// int변수에 결과를 대입하거나 결과를 byte로 형변환
		int d = b + c;
		byte d1 = (byte) (b + c);

		// 숫자 데이터에서 원하는 결과를 얻고자 할 경우 강제 형 변환을 적절히 이용

	}

}
