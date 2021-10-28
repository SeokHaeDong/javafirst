
public class Etc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제어문 안의 실행 문장이 1개 일때는 {} 생략 가능
		for (int i = 0; i < 3; i++)
			System.out.println("Hello Wolrd");

		for (int i = 0; i < 3; i++)
			System.out.println(i);
		
		
		for(int i = 0; i < 3; i++); {
			System.out.println("제어문의 () 뒤에 ; 붙여서 없는 것과 동일");
			System.out.println("한번만 수행");
		}
		
		//dead code 하등 쓸모가 없는 코드인듯
		/*
		 * for(;;) {} System.out.println("loop");
		 */
	}

}
