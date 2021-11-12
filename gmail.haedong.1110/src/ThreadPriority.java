
public class ThreadPriority {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new Thread() {
			public void run() {
				for(int i = 0; i <10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("스레드 1");
				}
			}
		};
		th.setPriority(Thread.MIN_PRIORITY);
		th.start();
		
		
		Thread th1 = new Thread() {
			public void run() {
				for(int i = 0; i <10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("스레드 2");
				}
			}
		};
		th1.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		
		
		
	}

}
