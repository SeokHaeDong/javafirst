import java.util.concurrent.Semaphore;

class SemaphoreThread extends Thread{
	Semaphore semaphore;
	
	public SemaphoreThread(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	public void run() {
		try {
			//열쇠를 취
			semaphore.acquire();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName());
		//열쇠를 반
		semaphore.release();
	}
}



public class SemaphoreTest {
	
	public static void main(String[] args) {
		// 동시에 3개까지 실행되도록 해준다
		Semaphore semaphore = new Semaphore(Runtime.getRuntime().availableProcessors());
		
		
		
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
	}

}
