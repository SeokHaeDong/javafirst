import java.util.Scanner;

public class Number_To_Change_BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//20과 17을 저장하는 변수를 생성
//		int data1 = 20;
//		int data2 = 17;
//		
//		
//		
//		
//		System.out.println("data1 : " + data1 + ", data2 : " + data2 + ", data1&data2 : " + (data1 & data2));
//		System.out.println("data1 | data2 : " + (data1 | data2));
//		System.out.println("data1 ^ data2 : " + (data1 ^ data2));
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String output = "";
//		for (int i = n; i > 0;  i/=2) {
//			System.out.println(i%2);
//		}
		
		
		
		while (n > 0) {
			output = (n % 2) + output;
			n = n / 2;
		}
		System.out.println(output);
		//출력이 반대가 되어야 
		
		
		
		
	}

}
