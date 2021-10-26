
public class Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;

		// 3동작을 1초마다 번갈아 가면서 수행
//		while(true) {							//while() - 반복문 (조건식) ()안의 조건문이 참(true, 1)일 경우 반복문을 조건에 일치하는 동안 반복한다
//			try {								//try {} catch() {} - 예외처리 구문 / Thread.sleep(1000)은 반복중 1초의 간격을 주기 위해서 사용
//				Thread.sleep(1000);				
//			}catch(Exception e){}
//			//3으로 나눈 나머지 - 0, 1, 2
//			int mod = i % 3;					//mod는 i를 3으로 나눈 나머지를 대입, 나머지는 0, 1, 2 
//			if(mod == 0) {						//if()  - 조건문을 이용하여 조건식이 참 일 경우 다음 블럭을 실행 한다 
//				System.out.println("빨강");
//			}
//			if (mod == 1) {
//				System.out.println("파랑");
//			}
//			if(mod == 2) {
//				System.out.println("녹색");
//			}
//			i++;								//i를 1씩 증가시켜준다
//		
//		}										//반복문을 탈출 하고 싶다면 조건문이나 조건식에서 i < 5; 와 같은 식을 주거나 
		// break를 사용하여 탈출이 가능하다

//		

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			int mod = i % 4;
			if (mod == 0) {
				System.out.println("봄");
			} else if (mod == 1) {
				System.out.println("여름");
			} else if (mod == 2) {
				System.out.println("가을");
			} else {
				System.out.println("겨울");
			}
			i++;
		}

	}

}
