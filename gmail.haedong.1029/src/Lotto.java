import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// 1 ~ 45 까지의 숫자 중 6개를 입력 받는데 중복이 없어야 하며 정렬을 하여 출력을 해야한다 
		Scanner sc = new Scanner(System.in);
		
		int [] lotto = new int[6];
		int len_lotto = lotto.length;
		
		for(int i = 0; i < len_lotto; i++) {
			System.out.print("로또 번호를 입력해 주세요 : ");
			int validation_lotto = sc.nextInt();
			
			if(validation_lotto  < 1 || validation_lotto > 45) {
				System.out.println("범위를 벗어난 숫자 입니다. 다시 입력해 주세요");
				i -= 1;
				continue;
			}
			
			boolean flag = true;
			
			
			for(int dummy_data : lotto) {
				if(validation_lotto == dummy_data) {
					System.out.print("중복된 숫자를 입력했습니다. 다시 입력해 주세요");
					flag = !flag;
					break;
				}
			}
			
			if(flag == false) {
				i -= 1;
				continue;
			}
			
			
			lotto[i] = validation_lotto;
			
		}
		
		for(int i = 0; i < len_lotto-1; i++) {
			for(int j = i+1; j <len_lotto; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
				
		}
		
		
//		for(int i = 0; i < len_lotto - 1; i++) {
//			if(lotto[i] > lotto[i+1]) {
//				int temp = lotto[i];
//				lotto[i] = lotto[i+1];
//				lotto[i+1] = temp;
//			}
//		}
		
		for(int print_lotto : lotto) {
			System.out.print(print_lotto + "  ");
		}
	}

}
