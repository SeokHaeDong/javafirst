
public class ThreadTerminate {
	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					}
					//InterruptedException 발생했을 때 
					//return 을 해주면 외부에서 interrupt()로 호출해서 스레드를 강제로 종료 할수 있다.
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("강제로 스레드 종료");
						e.printStackTrace();
						return;
					}
					System.out.println(i);
				}
			}
		};
		
		th.start();
		
		
		//스레드 강제 종료
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//th에게 InterruptedException 을 방생 시킴
		th.interrupt();
	}
}
