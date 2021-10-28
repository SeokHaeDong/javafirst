
public class Flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		boolean flag = true;
		i = 0;
		while (i < 10) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

			if (flag == true) {
				System.out.println("flag : true ? " + flag);
			} else {

				System.out.println("flag : false ? " + flag);
			}
			i += 1;
			flag = !flag;
		}

		System.out.println("-----------------------------------");

		// 인덱스 변수를 이용하여 반복문이 끝까지 수행되었는지 확인
		int j;
		for (j = 0; j < 5; j++) {
			if (i % 4 == 1) {
				break;
			}
			System.out.println("반복문이 마지막까지 했는지 확인");
		}

		if (j == 5) {
			System.out.println("반복문이 끝까지 수행");
		} else {
			System.out.println("반복문이 중간에 종료");
		}

		System.out.println("----------------------------------");

		boolean f = true;
		for (j = 0; j < 5; j++) {
			if (i % 4 == 10) {
				f = !f;
				break;
			}
			System.out.println("반복문이 마지막까지 했는지 확인");
		}

		if (f == true) {
			System.out.println("반복문이 끝까지 수행");
		} else {
			System.out.println("반복문이 중간에 종료");
		}

		System.out.println("-----------------------------------");

	}

}
