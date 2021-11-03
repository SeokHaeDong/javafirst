package DTOexample_member;

public class Member {
	private String member_id;
	private String member_name;
	private String member_pw;
	private String member_nickname;
	private int member_age;
	private String member_phone;
	
	
	/**
	 * @return the member_id
	 */
	public String getMember_id() {
		return member_id;
	}
	/**
	 * @param member_id the member_id to set
	 */
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	/**
	 * @return the member_name
	 */
	public String getMember_name() {
		return member_name;
	}
	/**
	 * @param member_name the member_name to set
	 */
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	/**
	 * @return the member_pw
	 */
	public String getMember_pw() {
		return member_pw;
	}
	/**
	 * @param member_pw the member_pw to set
	 */
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	/**
	 * @return the member_nickname
	 */
	public String getMember_nickname() {
		return member_nickname;
	}
	/**
	 * @param member_nickname the member_nickname to set
	 */
	public void setMember_nickname(String member_nickname) {
		this.member_nickname = member_nickname;
	}
	/**
	 * @return the member_age
	 */
	public int getMember_age() {
		return member_age;
	}
	/**
	 * @param member_age the member_age to set
	 */
	public void setMember_age(int member_age) {
		this.member_age = member_age;
	}
	/**
	 * @return the member_phone
	 */
	public String getMember_phone() {
		return member_phone;
	}
	/**
	 * @param member_phone the member_phone to set
	 */
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	
	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", member_name=" + member_name + ", member_pw=" + member_pw
				+ ", member_nickname=" + member_nickname + ", member_age=" + member_age + ", member_phone="
				+ member_phone + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
