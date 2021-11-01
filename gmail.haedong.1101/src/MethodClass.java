
public class MethodClass {
	// 매개변수 없는 메소드
	public void print_method() {
		System.out.println("Hello Java");
	}

	// static: 인스턴스 생성없이 클래스 이름으로 호출 가능하도록 생성
	public static void noArgDisp() {
		// 반복문을 3번 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("반복문");
		}
	}

	public static void argDisp(int n) {
		// 반복문을 3번 출력
		for (int i = 0; i < n; i++) {
			System.out.println("매개변수가 있는 함수");
		}
	}

	// 매개변수가 2개인 메소드
	public static void twoArgDisp(String str, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(str);
		}
	}

	// 리턴이 없는 2개의 정수를 받아서 더한 후 출력하는 메서드
	public void noReturnAdd(int n1, int n2) {
		System.out.println(n1 + n2);
	}

}
