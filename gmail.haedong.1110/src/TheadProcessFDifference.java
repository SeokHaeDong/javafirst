
public class TheadProcessFDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1초 마다 Hello Process를 10번 출력하는 문장이 아니고 1초에 1번씩 출력하는 문장을 10번 반복하는 문장이 아닐까
		
		//10번 반복
		for(int i = 0; i < 10; i++) {
			try {
				//1초 대기 - Thread.sleep 이용 
				Thread.sleep(1000);
				System.out.println("Hello Process");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("===========================================================================");
		
		//1초마다 Hello Process를 10번 출력하는 문
		int i = 0;
		while( i < 10) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello Thread");
			
			i++;
		}
		
		System.out.println("===========================================================================");
		
		//앞의 2개의 블럭은 프로세스 형태로 실행
		//앞쪽의 블럭이 끝나ㅑ만 뒤의 블럭이 실행된다 
		
		//스레드를 생성해서 시작
		new Thread() {
			//스레드를 시작시키면 호출되서 스레드로 동작하는 메서드
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("스레드1");
				}
			}
		}.start();
		
		System.out.println("===========================================================================");
		
		//앞의 2개의 블럭은 프로세스 형태로 실행
		//앞쪽의 블럭이 끝나ㅑ만 뒤의 블럭이 실행된다 
		
		//스레드를 생성해서 시작
		new Thread() {
			//스레드를 시작시키면 호출되서 스레드로 동작하는 메서드
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("스레드2");
				}
			}
		}.start();
		//스레드는 sleep을 만나서 쉬는 시간이 기면 다른 스레드의 작업을 수행할 수 있다.
		
		
	}

}
