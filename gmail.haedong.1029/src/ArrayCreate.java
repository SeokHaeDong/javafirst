
public class ArrayCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 처음부터 데이터를 가지고 생성하
		//정수(실수) 3개를 배열로 저장하기
		double [] scores = {90.9, 80, 89};
		
		//이름 3개를 배열로 저장하기 
		String [] names = {"hae", "dong", "young"};
		
		//데터 접근 
		//scores의 데이터 개수를 확인
		System.out.println("scores의 개 : " + scores.length);
		
		//세부 데이터 접근
		System.out.println("scores의 2번째 : " + scores[1]);
		
		//인덱스 오류
		/* System.out.println("socres[3]? " + scores[3]); */
		
		//이름이 없어서 발생하는 오류
		/* System.out.println(kors.length); */
		
		//NullPointerException
		/*
		 * int [] kors = null; System.out.println(kors.length);
		 */
		
		//전체 데이터 접근
		//인덱스를 상수 형채로 직접 작성 - 데이터가 많아지면 사용하는 것이 불가능 (미친짓)
		System.out.println("인덱스를 직접 작성");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		
		System.out.println("---------------------------------------------");
		
		System.out.println("=일반적인 반복문을 이용한 방법 - 반복횟수를 이용하는 방법=");
		//반복문을 이용한 방법 - 반복횟수를 상수로 설정하는 방
		System.out.println("반복문을 이용한 배열의 출력");
		int i = 0;
		while( i < 3) {
			System.out.print("names : ");
			System.out.print(names[i] + ", ");
			i += 1;
		}
		
		
		System.out.println("\n"+"----------------------------------------------");
		
		
		//반복문을 이용한 방법 - 데이터의 개수로 이용하는 방법
		//이렇게 만들면 데이터의 개수가 변경되도 그대로 사용 가능하기 때문에 앞의 방법보다 좋다고 합니다.
		
		System.out.println("=일반적인 반복문을 이용한 방법 - 데이터 개수를 이용하는 방법=");
		i = 0;
		while( i < names.length) {
			System.out.print("names : ");
			System.out.print(names[i] + ", ");
			i += 1;
		}

		
		System.out.println("\n" + "----------------------------------------------------");
		
		//일반적인 반복문을 이용한 방법 - 데이터 개수를 변수에 저장해서 이요하는 방
		//names.length에 비해서 메모리 접근 횟수가 줄어서 속도가 빠릅니다.
		i = 0;
		int len = names.length;
		while( i < len) {
			System.out.println(names[i]);
			i += 1;
		}
		
		System.out.println("------------------------------------------------------------");
		
		//빠른 열거를 이용하는 방법
		//빠른 열거는 이전에 적ㅂ근했던 위치에서 접
		//names의 데이터를 순서대로 name에 대입해서 사
		for(String name : names) {
			System.out.println(name);
		}
		
		
		
	}

}
