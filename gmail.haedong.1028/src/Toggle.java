
public class Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 10) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

			if (i % 2 == 0) {
				System.out.println("ON");
			} else {
				System.out.println("OFF");
			}

			i += 1;
		}

		System.out.println("----------------------------------");

		i = 0;
		while (i < 10) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

			if (i % 3 == 0) {
				System.out.println("오미크론");
			} else if (i % 3 == 1) {
				System.out.println("라투");
			} else {
				System.out.println("다크스펙터");
			}
			i += 1;
		}

		System.out.println("-----------------------------------");

		i = 0;
		while (i < 10) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

			if (i % 5 == 0) {
				System.out.println("오미크론");
			} else if (i % 5 == 1) {
				System.out.println("라투");
			} else if (i % 5 == 2) {
				System.out.println("다크스펙터");
			} else if (i % 5 == 3) {
				System.out.println("오미크론");
			} else if (i % 5 == 4) {
				System.out.println("다크스펙터");
			}
			i += 1;
		}

	}

}
