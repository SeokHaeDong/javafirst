import java.util.Scanner;

public class ArrayDataUpdate {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//3개의 문자열을 입력받아서 배열에 저장
//		
//		//3개의 문자열을 저장 할 수 있는 배열을 생성
//		String [] myApps = new String[3]; //현재는 3개의 공간만 생성 - 데이터 null
//		int len = myApps.length;
//		
		//배열의 개수만큼 문자열을 입력받아서 배열에 저장
		//키보드로부터 입력 받기 위한 인스턴스 생
		Scanner sc = new Scanner(System.in);
//		
//		
//		for(int i = 0; i < len; i++) {
//			System.out.print("앱 이름 입력 : ");
//			//문자열을 입력받아서 myApps에 순서대로 저
//			myApps[i] = sc.nextLine();
//		}
//		
//		//myApps의 모든 데이터를 출력
//		int count = 0;
//		while (count < len) {
//			System.out.println("앱 이름 : " + myApps[count]);
//			count += 1;
//		}
//		
//		for(String app : myApps) {
//			System.out.println(app);
//		}
//		
		
		int test_case = 0;
		System.out.print("테스트 케이스 입력 : ");
		test_case = sc.nextInt();
		
		int [] ages = new int[test_case];
		int len = ages.length;
		for(int i = 0; i < len; i++) {
			System.out.print("나이 입력 : ");
			ages[i] = sc.nextInt();
		}
		
		

		
		for(int age : ages) {
			System.out.println(age);
		}
		
		
		
		
		
		
		
		
		
		
		//스캐너 연결 해제 
		sc.close();
		
	}

}
