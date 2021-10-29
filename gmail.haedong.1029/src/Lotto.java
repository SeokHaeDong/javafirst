import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 45까지 6개의 숫자를 중복없이 저장하고 작은 것 부터 큰 것 순으로 출력
		// 6개의 숫자는 키보드로부터 입력 받기

		// 데이터 : 1 ~ 45 사이의 숫자 6개. 아직 결정되지 않은 수
		// 1. 1 ~ 45ㅊ 까지의 숫자 6개를 저장할 수 있는 공간을 확보

		Scanner sc = new Scanner(System.in);
		int[] number_array = new int[6];

		// int i = 0;
		// if( i > 0 && i <= 45) {
		// for(int j = 0; j < 6; j++) {
		// System.out.print("숫자를 입력학시오 : ");
		// number_array[i] = sc.nextInt();
		//
		// int len = number_array.length;
		// for(int k = 0; k < len - 1; k++) {
		// for(int l = k; i < len; k++) {
		// if (number_array[k] > number_array[l]) {
		// int temp = number_array[k];
		// number_array[k] = number_array[l];
		// number_array[l] = temp;
		// }
		// }
		// }
		//
		//
		// }
		// }else {
		// System.out.println("입력 범위를 벗어남");
		// }

		int[] lotto = new int[6];
		int lotto_len = lotto.length;

		for (int i = 0; i < lotto_len; i++) {
			System.out.print("1 ~ 45 숫자를 입력 : ");
			int input = sc.nextInt();

			if (input < 1 || input > 45) {
				System.out.println("입력한 숫자가 잘못 된 숫잡입니다. ");
				i -= 1;
				continue;
			}

			boolean flag = true;
			for (int imsi : lotto) {
				if (input == imsi) {
					System.out.println("중복된 숫자");
					flag = !flag;
					break;
				}
			}

			if (flag == false) {
				i -= 1;
				continue;
			}

			lotto[i] = input;

		}
		
 		for(int i = 0;  i < lotto_len-1; i++) {
			for(int j = i+1; j < lotto_len; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		

		for (int all_data : lotto) {
			System.out.print(all_data + " ");
		}

		sc.close();

	}

}
