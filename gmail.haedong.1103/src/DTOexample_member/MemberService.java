package DTOexample_member;


//회원관리 작덥을 위한 인터페이스 
public interface MemberService {
	//회원 가입을 위한 처리 
	public boolean member_sign_up(Member member);
	
	public boolean member_info_delete(String memberpw);
	
	public Member member_info(String memberid, String memberpw);
	
	public boolean member_info_update(Member member);
	
	public boolean member_login(String memberid, String memberpw);
	
	public void member_logout();
}
