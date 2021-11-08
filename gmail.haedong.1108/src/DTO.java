//하나의 행을 표현하기 위한 클래스  - DTO 또는 VO 라고 한다
public class DTO {
	private String name;
	private int age;
	private String brith;
	
	//접근자 메서드
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
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the brith
	 */
	public String getBrith() {
		return brith;
	}
	/**
	 * @param brith the brith to set
	 */
	public void setBrith(String brith) {
		this.brith = brith;
	}
	
	@Override
	public String toString() {
		return "DTO [name=" + name + ", age=" + age + ", brith=" + brith + "]";
	}
	
	
	
	
}
