import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤 인스턴스 생성
		Random r = new Random();
		for(int i = 0; i < 6; i++) {
			int x = r.nextInt(45);
			System.out.println(x+1);
		}
	}

}
