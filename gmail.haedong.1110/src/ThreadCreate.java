
//Thread를 상속받는 클래스 
class ThreadEx extends Thread {
	// 스레드로 수행할 내용을 가진 메서드
	public void run() {
		// Thread.sleep을 사용하는 이유는 delay를 만들기 위해서
		// 0.01 초씩 대기하면서 스레드 1이라고 출력하도록 만들기
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("스레드1");
		}
	}
}

//Runnable 인터페이스를 구현한 클래스 
class RunnableImpl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 0,01초 마다 스레드2 라고 10번 출력하기
		int i = 0;
		while (i < 10) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("스레드2");
			i += 1;
		}
	}

}

public class ThreadCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread를 상속받은 ThreadEx 클래스를 가지고 스레드를 생성하고시작
		ThreadEx th = new ThreadEx();
		th.start();
		// new ThreadEx().start(); 로 사용해도 욈

		// Runnable 인터페이스를 구현한 RunnableImpl 클래스를 가지고 스레드를 생성하고 시작
		RunnableImpl runnable = new RunnableImpl();
		Thread th1 = new Thread(runnable);
		th1.start();
		// new Thread(new RunnableImpl()).start() 로 호출

		// run으로 호출을 하면 스레드로 실행을 하지 못하고 일반 메서드 호출을 해서 프로세스 실행하는 것과 동일하다
		// th.run();
		// th1.run();

		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("스레드3");
				}
			}

		};

		Thread th3 = new Thread(r);
		th3.start();

		Thread th4 = new Thread() {
			public void run() {
				int i = 0;
				while (i < 10) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("스레드4");
					 i += 1;
				}

			}
		};
		th4.start();
		
		/*
		 * new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub for(int i =
		 * 0; i < 10; i++) { try { Thread.sleep(10); } catch (InterruptedException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 * System.out.println("스레드 19999"); } }
		 * 
		 * }.run();
		 */

	}

}
