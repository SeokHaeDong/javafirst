
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
		
		
		for(int i = 0; i < 5; i++) {
			if (i < 3) {
				for(int j = 0; j < 2-i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
			}else {
				for(int j = 0; j < i - 2; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < 5-i ;j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
			
		}
		
		System.out.println("-------------------------------------------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		

	}

}
