package DTOexample_member;

public class MemberServiceImpl implements MemberService {

	@Override
	public boolean member_sign_up(Member member) {
		// TODO Auto-generated method stub
		System.out.println("회원 가입 처리");
		return false;
	}

	@Override
	public boolean member_info_delete(String member_password) {
		// TODO Auto-generated method stub
		System.out.println("회원 탈퇴 처리 ");
		return false;
	}

	@Override
	public Member member_info(String member_id, String member_password) {
		// TODO Auto-generated method stub
		System.out.println("회원 정보가져오기");
		return null;
	}

	@Override
	public boolean member_info_update(Member member) {
		// TODO Auto-generated method stub
		System.out.println("회원정보 수");
		return false;
	}

	@Override
	public boolean member_login(String member_id, String member_pw) {
		// TODO Auto-generated method stub
		System.out.println("회원로그인");
		return false;
	}

	@Override
	public void member_logout() {
		// TODO Auto-generated method stub
		System.out.println("회원 로그아웃");

	}

}
