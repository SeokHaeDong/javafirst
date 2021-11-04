//번호와 이름을 갖는 클래스 
public class DTO {
	
	private int number; //번호를 저장할 속
	private String name; // 이름을 저장할 속
	
	//내용을 복제해서 리턴해주는 메서드 
	public DTO clone() {
		//빈 객체를 생
		DTO others = new DTO();
		//현재 인스턴스릐 내용을 새로 생성한 인스턴스에 복사 
		others.number = number;
		//문자열은 새로 생성해서 복사 - 깇은 복사 
		others.name = new String(name);
		return others;
	}
	
	
	
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "DTO [number=" + number + ", name=" + name + "]";
	}
	
	//인스턴스의 내용이 같은지 비교하는 메서드 equals를 재정의 해서 사용자 입맞에 맞춰 사용이 가능하다 
	public boolean equals(DTO other) {
		//문자열의 일치 여부는 equals로 비료해야한다 ==로 비교하면 X
		if(number == other.number && name.contentEquals(other.name)) {
			return true;
		}
		return false;
	}
	
}
