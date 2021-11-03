package DTOexample_member;

import java.util.Scanner;

public class MemberController {
	public static void main(String[] args) {
		// 콘솔로부터 입력받는 객체 만들기
		Scanner sc = new Scanner(System.in);
		
		final String REGISTER = "1";
		final String DELETE = "2";
		final String INFO = "3";
		final String UPDATE = "4";
		final String LOGIN = "5";
		final String LOGOUT = "6";
		final String EXIT = "7";
		
		// 무한 반복해서 작업하다가 7번을 누르면 종료하기
		// MemberServiceImpl이 MemberService를 implements 했으므로 아래처럼 작성해도 된다
		MemberService memberService = new MemberServiceImpl();

		while (true) {
			System.out.print("메뉴를 입력해 주세요 : ");
			String input = sc.nextLine();
			switch (input) {
			case REGISTER:
				memberService.member_sign_up(null);
				break;
			case DELETE:
				memberService.member_info_delete(null);
				break;
			case INFO:
				memberService.member_info(null, null);
				break;
			case UPDATE:
				memberService.member_info_update(null);
				break;
			case LOGIN:
				memberService.member_login(null, null);
				break;
			case LOGOUT:
				memberService.member_logout();
				break;
			case EXIT:
				System.out.println("잘못된 메뉴 입력");
				break;

			}
			if (input.contentEquals("7")) {
				break;
			}

		}
		sc.close();
	}
}
