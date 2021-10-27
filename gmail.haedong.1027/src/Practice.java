
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//113507 초가 몇 시간 몇 분 몇초 인지 계산 --> time은 초 인데 몇 시간 몇 분 몇초를 구하라??
		int time = 113507;
		int H = time / 3600;
		int M = (time % 3600) / 60;
		int S = time % 60;
		
		System.out.println(H + "시간" + M + "분" + S + "초");
		
		int x = 30;
		int y = 70;
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		//x와 y의 데이터를 교환하기
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}

}
