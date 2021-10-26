
public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -11;
		// ~은 1의보수 - 부호는 반대, 절대값은 1증가 혹은 감소
		// 그래픽 프로그램에서 색상 반전에 이용
		System.out.println("~n : " + ~n);

		// !(not) - boolean 데이터 반전
		boolean b = true;
		System.out.println("!b : " + !b);

		n = 10;
		// n의 값을 1증가
		n++;
		System.out.println("n++ : " + n);
		// --n의 값을 1 감소
		n--;
		System.out.println("n-- : " + n);

		// ++, --가 뒤에 붙으면 ++, --을 하지 않고 먼저 사용하고 나중에 ++, -- 수행
		n = 10;
		System.out.println("n++ : " + (n++));

		// 앞에 붙으면 먼저 ++, --을 수행하고 명령에 사용
		System.out.println("++n : " + (++n));

		n = 10;
		System.out.println("n-- : " + (n--));

		System.out.println("--n : " + (--n));

		// ++,-- C계열의 언어에만 존재 / C와 JAVA는 다르게 동작함
		n = 0;
		int result = ++n + ++n;
		System.out.println("result : " + result);

	}

}
