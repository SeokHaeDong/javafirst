import java.util.Scanner;

public class ConsoleInput {
	public static void main(String[] args) {
		
		//키보드로 입력받을 수 있는 인스턴스 생
		Scanner sc = new Scanner(System.in);
		
		
		//문자열 입력받기
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("name : " + name);
		
		
		//정수 입력받기
		System.out.print("점수 입력하세요 : ");
		int score = sc.nextInt();
		System.out.println("score : " + score);
		
		//문자열 입력받기
		System.out.print("별명을 입력하세요 : ");
		//숫자 입력을 받고 문자열을 입받을 때는 nextLine()을 추가
		sc.nextLine();
		String nick = sc.nextLine();
		System.out.println("nick : " + nick);
				
		
		sc.close();
		
	}
}
