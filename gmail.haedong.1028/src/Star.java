
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for (int i = 0; i < 5; i++) { System.out.print("*"); }
		 * System.out.println("");
		 */
		System.out.println("-----------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("-----------------------------------------");

		for (int i = 1; i < 10; i++) {
			System.out.println("2" + " * " + i + " = " + (2 * i));
		}

		System.out.println("-----------------------------------------");

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println("");
		}

		System.out.println("-----------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}
			System.out.println("");
		}

		System.out.println("-----------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("-----------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("-----------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("-----------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < -2 * i + 9; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("-----------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("-----------------------------------------");

		for (int i = 0; i < 5; i++) {

			if (i < 3) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < 5 - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");

		}

		System.out.println("------------------------------------------");

		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				for (int j = 0; j < 2 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < i - 2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 5 - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");

		}

		System.out.println("-------------------------------------------");

		int prev_previous = 1;
		int previous = 1;
		int current = 0;
		int count = 3;

		while (count <= 12) {
			current = prev_previous + previous;

			prev_previous = previous;
			previous = current;

			count += 1;

		}

		System.out.println(current);

		// 1 1 2 3 5 8 13 21 34 55 89 144

		System.out.println("-------------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print("-");
			}

			if (4 - i != -1 && i != 4) {
				System.out.print("*");
			} else if (i == 4) {
				for (int j = 0; j < 5; j++) {
					System.out.print("*");
				}
			}

			if (i > 0 && i != 4) {
				for (int j = 0; j < 2 * i - 1; j++) {
					System.out.print("-");
				}
			}

			if (4 + i != -1 && i != 4 && i != 0) {
				System.out.print("*");
			} else if (i == 4) {
				for (int j = 0; j < 4; j++) {
					System.out.print("*");
				}
			}

			/*
			 * for (int j = 0; j < 2 * i + 1; j++) { System.out.print("*"); for(int k = i; k
			 * < 2*i+1; k++) { System.out.print("-"); }
			 * 
			 * }
			 */

			System.out.println("");
		}

		System.out.println("----------------------------------------------");

		for (int i = 0; i < 5; i++) { // 별의 범위에서 양 끝에 속하는 열을 출력해야 하므로, 0부터 시작한다.
			// 예를들어 n이 4일 경우 첫 번째 행은 4번 열에만 별이 찍히고,
			// 두 번째 행은 4-1, 4+1 열에만 별이 찍히게 된다.
			for (int j = 1; j < 2 * 5; j++) { // 열의 범위는 별 찍기-16과 동일하다.
				if (j > 5 + i)
					break; // 마지막 별을 찍었으면 반복문을 벗어난다.
				if (i == 5 - 1) { // 마지막 행에 도착하면 모든 열에 별을 찍는다.
					System.out.print("*");
					continue;
				}
				if (j == 5 - i || j == 5 + i) { // 범위의 양 끝에 별을 찍는다.
					System.out.print("*");
				} else
					System.out.print("-");
			}
			System.out.println();

		}

		System.out.println("----------------------------------------------");

		// 마지막 부분은 따로 분리해서 출력하고 그 전에는 절반만 출력하면 나머지는 자
		for (int i = 0; i < 5; i++) {

			if (i == 4) {
				for(int j = 0; j < 9; j++) {
					System.out.print("*");
				}
			} else if(i < 4){
				for(int j = 0; j < 4 - i; j++) {}
				System.out.print("-");
			}
			
			System.out.println("");
		}

	}

}
