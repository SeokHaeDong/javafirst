
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MethodClass의 인스턴스 생
		MethodClass obj = new MethodClass();
		// 메소드를 호출
		obj.print_method();
		obj.print_method();
		obj.print_method();

		// static이 없는 메서드는 반드시 인스턴스를 생성해서 호출해야함
		// MethodClass.method();

		// static 메소드 호출
		MethodClass.noArgDisp();

		// 매개변수가 정수 1개인 static 메소드 호출
		MethodClass.argDisp(5);

		// 매개변수가 2개인 메소드 호출
		MethodClass.twoArgDisp("출력할 내용", 3);

		// static이 없는 메서드는 인스턴스를 이용해서 호출

		MethodClass ins = new MethodClass();
		// return 이 없는 메서드라서 호출하고 끝
		ins.noReturnAdd(4, 6);

	}

}
