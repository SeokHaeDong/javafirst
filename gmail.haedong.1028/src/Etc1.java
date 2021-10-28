
public class Etc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 10) {
			System.out.print((i + 1) + " ");
			i += 1;
		}

		System.out.println("\n" + "-----------------------------------");

		for (i = 1; i <= 10; i++) {
			//3의 배수 되면 반복문을 종료
			if ( i % 3 == 0) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("\n" + "-----------------------------------");
		
		for (i = 1; i <= 10; i++) {
			//2의 배수가 되면 아래 문장을 수행하지 않기 떄문에 출력이 되지 않는다 
			if ( i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		
		
	}

}
