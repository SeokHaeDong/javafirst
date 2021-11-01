
public class Person {
	//한 명의사람 정보를 나타내기 위한 속성 - private 으로 생성 
	private int num;
	private String name;
	private String phone;
	private String address;
	
	//접근자 메서드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//인스턴스를 문자열로 리턴해주는 메서드 
	//출력하는 메서드에 인스턴스 이름을 대입하면 자동으로 호출 
	@Override
	public String toString() {
		return "Person [num=" + num + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
	 
	
	
	
	
}
