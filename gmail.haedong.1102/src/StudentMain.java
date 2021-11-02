
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역변수는 자동으로 초기화 되지 않습니다.
		//지역변수(메서드 안에서 만든 변수)는 자동으로촣기화 되지 않습니다. 
//		int a; 
//		System.out.println(a);
		
		
		
		//인스턴스 생성
		Student stu = new Student();
		//멤버 변수는 자동으로 초기화 
		//숫자는 0 , boolean은 false, 그 이외는 null로 초기화 
		System.out.println(stu.getNum());
		System.out.println(stu.getStu_name());
		System.out.println(stu.getScores());
		
		/*
		 * System.out.println(stu.getScores()[0]);
		 */
		
		//setter를 이용해서 데이터 주입(Dependency Injection)
		/*
		 * stu.setStu_name("hae"); stu.setNum(1); int [] ar = new int[3];
		 * stu.setScores(ar);
		 */
		
		System.out.println(stu.getStu_name().toUpperCase());
		System.out.println(stu.getScores()[0]);
		
		
		//매개변수가 3개인 생성자를 호출
		Student stu1 = new Student(2, "park", new int[3]);
		System.out.println(stu1.getNum());
		System.out.println(stu1.getStu_name().toUpperCase());
		System.out.println(stu1.getScores()[0]);
		
	}

}
