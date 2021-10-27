
public class If_5 {
	public static void main(String[] args) {
		String id = "Haedong";
		String pw = "1234";

		// id와 pw가 일치하면 로그인 성공
		// id는 일치 하지만 pw가 불일치 시 비밀번호 불일치
		// id가 불일치 하면 없는 아이디 라고 출력
		// 나중에 id와 pw는 입려 화면에서 읽어오고 데이터를 데이터베이스 와 비교하면 실제 로그인을 만들 수 있
		if (id == "Haedong" && pw == "1234") {
			System.out.println("로그인 성공");
		} else if (id == "Haedong") {
			System.out.println("비밀번호가 틀렸음");
		} else {
			System.out.println("존재하지 않는 아이디");
		}

		if (id == "Haedong" && pw == "1234") {
			System.out.println("로그인 성공");
		} else if (id == "Haedong" && pw != "1234") {
			System.out.println("비밀번호가 다름");
		} else if (id != "Haedong" && pw == "1234") {
			System.out.println("아이디가 다름");
		} else {
			System.out.println("그런거 없음");
		}

	}
}
