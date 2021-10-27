
public class If_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 89;
		
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		
		
		int su = 77;
		if (su % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
		int year = 2024;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년");
		}else {
			System.out.println("윤년 아님");
		}
		
		
		
		
		
		
		
		
	}

}
