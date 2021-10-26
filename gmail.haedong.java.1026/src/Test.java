
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 10.7;
		// d의 값을 소수 첫째 자리에서 반올림해서 저장
		// 강제 형 변환과 사직연산을 적절히 이용하면 됨
//		int result = (int)++d;
		int result = (int) (d + 0.5);
		System.out.println(result);

		d = 10.77;
		// 소수 두째 자리 반올림 해서 출력 - 10.8
		// 반올림하고자 하는 자리를 소수 첫째자리로 만들기
		System.out.println(((int) (d * 10 + 0.5) / 10.0));

		int money = 87650;
		// 10의 자리에서 반올림해서 출력하기 - 87700
		System.out.println(money + (money % 100));

	}

}
