import java.util.Random;

public class ExceptionHandlingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//예외가 발생할 만한 코드 작성
			int n = 10;
			int x = 2;
			int result = n / x;
			System.out.println("result : " + result);
			
			//arr이 null 이므로 NullPointerException 발생
			int [] arr = null;
			int size = arr.length;
			System.out.println("size : " + size); 
			
			
			
		}catch(ArithmeticException e) {
			//ArithmeticException이 발생했을 때 처리할 내
			System.out.println("산술예외 : " + e.getLocalizedMessage());
		}catch(NullPointerException e) {
			System.out.println("null"
					+ "예외 : " + e.getLocalizedMessage());
		}catch(Exception e) {
			System.out.println("모든 예외처리 가능 : " + e.getLocalizedMessage());
		}finally {
			System.out.println("무조건 수행할 내용");
			System.out.println("주로 외부 자원연결 해제 코드를 작성");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
