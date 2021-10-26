
public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10 > 3);

		int year = 2021;
		// year가 윤년인지 판별 / 4의 배수이고 100의 배수가 아니면 윤년 또는 400의 배수인 경우

		// 배수는 그 숫자로 나눈 나머지가 0인 수
		boolean pan = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);

		if (pan == true) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년 아님");
		}

		// and 나 or는 좌우의 식의 순서를 변경해도 결과는 동일
		// 1부터 100까지에서 3의 배수와 4의 배수를 출력
		// &&는 앞의 결과가 false이면 뒤의 결과를 확인하지 않음
		// ||는 앞의 결과가 true이면 뒤의 결과를 확인하지 않음
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				count += 1;
			}

		}
		System.out.println(count);

		// 위의 방법은 반복을 하는 수가 더 많은 반면 아래 코드는 반복문의 반복 횟수가 적어 더 좋은 코드라 할수 있다
		count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0 && i % 3 == 0) {
				count += 1;
			}

		}
		System.out.println(count);

		int x = 10;
		boolean r = x > 5 && x++ > 10;
		System.out.println(x);
		System.out.println(r);

		x = 10;
		r = x < 5 && x++ > 10;
		System.out.println(x);
		System.out.println(r);
	}

}
