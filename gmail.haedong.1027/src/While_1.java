
public class While_1 {
	public static void main(String[] args) {
		//Hello Java! 3번 출력
		//System.out.println()으로 출력하는 방법도 있고 이 방법이 더 속도적인 반면에서는 빠름
		//하지만 유지보수가 어려워
		
		
		//i를 조작하고 확인을 해야 하기 때문에 속도가 느림 
		//하지만 유지보수 용이 함
		int i = 0;
		while (i < 3) {
			System.out.println("Hello Java!");
			i++;
		}
	}
}