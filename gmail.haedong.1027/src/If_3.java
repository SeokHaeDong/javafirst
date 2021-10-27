
public class If_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 79;
		if (score >= 80) {
			System.out.println("장학금");
		} else if (score >= 60) { // score < 80 은 생략해도 문제 없
			System.out.println("보통");
		} else if (score < 60) { // 조건식 생략해도 됨 단! 그렇게 되면 else로 바꿔야
			System.out.println("경고");
		}

	}

}
