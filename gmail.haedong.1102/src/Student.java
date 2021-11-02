import java.util.Arrays;

public class Student {
	//번호를 저장할 속성
	private int num;
	//이름을 저장할 속성
	private String stu_name;
	//점수 3개를 저장할 속성
	private int [] scores;

	//매개변수가 없는 생성자 - 리턴이 없음
	//매개변수가 없는 생성자를 Default Constructor이라고 
	public Student() {
		num = 1;
		stu_name = "noname";
		scores = new int[3];
	}
	
	
	//매개변수가 있는 생성자
	//외부에서 주입받아서 초기화 시키기 위한 생성자
	//매개변수가 없는 생성자가 있어서 생성자가 2개 이므로 Overloading
	public Student(int n, String irum, int [] ar) {
		num =n;
		stu_name = irum;
		scores = ar;
	}
	
	
	
	
	
	
	//접근자 메서드 - getter(값을 가져온다), setter()
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the stu_name
	 */
	public String getStu_name() {
		return stu_name;
	}

	/**
	 * @param stu_name the stu_name to set
	 */
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	/**
	 * @return the scores
	 */
	public int[] getScores() {
		return scores;
	}

	/**
	 * @param scores the scores to set
	 */
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	//인스턴스를 문자열로 변환해주는 메서드
	//디버깅을 편리하게 하기 위한 메서드//출력하는 메서드에 인스턴스 이름을 대입하면 자동으로 호출되기 때
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", stu_name=" + stu_name + ", scores=" + Arrays.toString(scores) + "]";
	}
	
	


}
