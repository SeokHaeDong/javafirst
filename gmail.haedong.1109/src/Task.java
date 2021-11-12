
public class Task {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i = 11; i<=20; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		new Thread() {
			@Override
			public void run() {
				for(int i = 1; i<=10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println(i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
		new Thread() {
			@Override
			public void run() {
				for(int i = 11; i<=20; i++) {
					try {
						Thread.sleep(1000);
						System.out.println(i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
	}
}
