import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 5개를 저장하는 배열을 생성 = 초기값을 임의로 부여
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("입력 데이터 개수 : ");
//		int input_array_size = sc.nextInt();
//		
//		
//		int [] array = new int[input_array_size];
//		int len = array.length;
//		for(int i = 0; i < len; i++) {
//			System.out.print("데이터 입력 : ");
//			array[i] = sc.nextInt();
//		}
		
		int [] array = {87, 84, 96, 88, 85};
		int len = array.length;
		
		for(int all_data : array) {
			System.out.print(all_data + " ");
		}
		
		//선택정렬
		//첫번때 자리부터 마지막 -1 까지 이터를 출력
		
		
		System.out.println( "\n" + "----------------------------");
		
		for(int i = 0; i < len-1; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		System.out.println("\n"+"--------------------------------------");
		
		
		//첫번째 자리 부터 마지막 -1 까지 데이터를 자신의 뒤에 있는 모든 데이터 들과 비교래서 자신의 데이터가 더 크면 2개의 데이터의 위치를 교
		
		//전체가 필요하지 않거나 인덱스가 필요할때는 빠른 결거를 사용하면 안
		for(int i = 0; i < len-1; i++) {
			// i번쨰 뒤에 있는 모든 것들 
			for(int j = i+1; j < len; j++) {
//				System.out.print(array[j] + " ");
				//자신의 데이터와 뒤에 있는 데이터를 비료해서 자신이 더 크
				if(array[i] > array[j]) {
					//데이터 위치를 교환 - swap
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println("");
		}
		
		for(int sort_array : array) {
			System.out.println(sort_array);
		}
		
	}

}

