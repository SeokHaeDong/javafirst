
public class Array_1 {
	public static void main(String[] args) {
		//3개의 점수를 저장
		int score1 = 90;
		int score2 = 99;
		int score3 = 87;
		
		//3개를 출력
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		
		
		//묶어서 하나의 이름으로 저장 - 배열
		//배열을 사용하면 scores라는 이름 1개만 필
		int [] scores = {90, 99, 87};
		
		//배열은 반복문을 이용해서 모든 데이터에 접근 할 수 있기 때문에 처리 하는 문장이 간결해진다
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		
		for(int score : scores) {
			System.out.println(score);
		}
		
		
	}
}
