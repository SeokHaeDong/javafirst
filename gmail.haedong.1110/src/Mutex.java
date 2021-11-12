class ShareData implements Runnable{
	private int result;
	private int idx;
	
	public int getResult() {
		return result;
	}
	
	private void sum() {
		//idx를 1000번 증가시켜서 result에 더해주기
		for(int i=0; i<1000; i=i+1) {
			idx = idx + 1;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			result = result + idx;
		}
	}
	
	//스레드로 동작할 메서드
	public void run() {
		sum();
	}
}


public class Mutex {

	public static void main(String[] args) {
		//ShareData 인스턴스 생성
		ShareData sh = new ShareData();
		//위의 인스턴스를 가지고 스레드를 생성 - 공유 데이터를 가지고 스레드를 생성
		Thread th1 = new Thread(sh);
		Thread th2 = new Thread(sh);
		
		//스레드 실행
		th1.start();
		th2.start();
		
		// term이 없으면 System.out.println이 먼저 실행 되어 값이 0이 출력이 되어 버린다.
		// 계산하는데 시간이 걸려서 이러한 문제가 생겼다.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//sh 의 result 값을 출력
		System.out.println(sh.getResult());

	}
}