
public class If_4 {
	public static void main(String[] args) {
		long startTime_if = System.nanoTime();
		long startTime_if1 = System.nanoTime();

		//조건문이 한번 더 사용되는 것은 큰문제로 여겨지지 않지만 반복문의 경우는 한번 더 사용이 된다면 큰 문제로 여겨지게 된다 
		//조건을 체크 하고 내려가야 하기 때문에 큰 차이는 없지만 그래도 조금 더 시간이 걸린다 
	
		int score = 89;
		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				System.out.println("수");
			} else if (score >= 80) {
				System.out.println("우");
			} else if (score >= 70) {
				System.out.println("미");
			} else if (score >= 60) {
				System.out.println("양");
			} else {
				System.out.println("가");
			}
		} else {
			System.out.println("조건을 만족하는 score를 입력");
		}
		// else는 잘못된 상황에 대한 처리로 사용하는 것도 프로그램을 간겅하게 만드는 기법 중 하
		// 2가지의 조건문을 비교 시  중첩이 훨씬 빠름

		/*
		 * int score = 89; if(score >= 90 && score <= 100) { System.out.println("수");
		 * }else if(score >= 80 && score < 90) { System.out.println("우"); }else if(score
		 * >= 70 && score < 80) { System.out.println("미"); }else if(score >= 60 && score
		 * < 70) { System.out.println("양"); }else { System.out.println("가"); }
		 */

		long endTime_if = System.nanoTime();
		long endTime_if1 = System.nanoTime();
		System.out.println(endTime_if - startTime_if);
		System.out.println(endTime_if1 - startTime_if1);

	}

}
