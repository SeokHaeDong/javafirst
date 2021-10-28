
public class For_1 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 3) {
			System.out.println("Hello World");
			i += 1;

		}

		System.out.println("------------------------------------");

		for (int j = 0; j < 3; j++) {
			System.out.println("Hello Java");
		}

		for (int x = 0; x < 3; x++) {
			System.out.println("image" + (x + 1) + ".png");
		}
		// 제어문 안에서 만든 변수는 제어문 바깥에서는 사용할 수 업음

		// for구문 첫번째 문장에서 변수를 반드시 생성할 필요가 없음
		for (i = 0; i < 3; i++) {
			System.out.println(i);

		}

		System.out.println("-------------------------------------");

	}
}
