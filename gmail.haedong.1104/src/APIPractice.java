import java.util.Random;

public class APIPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(java.lang.Math.random());
		
		//java.lang.Math 클래스의 random 메서드 시용해서 랜덤한 실수 만들어서 출력하기 
		double d = java.lang.Math.random();
		System.out.println(d);
		
		
		//java,util.Random이라는 클래스의 nextInt 라는 메서드를 이용하면 랜덤한 정수를 생설할 수 있습니다.
		//랜덤한 정수를 생성해서 출력
		
		Random rd = new Random();
		int s = rd.nextInt();
		System.out.println(s);
		
		//생성자 없음 new 사용하지 못함 + 걍 쓰면 
//		java.lang.Math = new java.lang.Math();
		
		 try {
			java.lang.Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 
		 //java.lang.Runtime 클래스는 모든 멤버가 static이 아니므로 인스턴스를 생성해야 한다. abstract class도 interface도 아님
		 //근데 Runtime runtime = new Runtime(); 은 에러 
		 //메서드 중에 자기 자신을 리턴하는 메서드가 있는지 확인 
		 Runtime runtime = Runtime.getRuntime();
		 
		
	}

}
