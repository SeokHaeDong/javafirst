
public class Etc {
	public static void main(String[] args) {
		//실수를 정장하는 변구 2개 생성
		double d1 = 20.7;
		double d2 = 17.3;
		//d1 > d2 이면 d1이 남고 아니면 d2가 남는다 
		double max = d1 > d2 ? d1 : d2;
		System.out.println("큰 수 :" + max);
		
		int x = 30;
		x -= 20;
		System.out.println(x);
		
	}
}
