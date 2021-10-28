
public class InfinityLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				// 3초대기 - Java는 시간을 1/1000 초 단위로 사용
				Thread.sleep(3000);
			} catch (Exception e) {

			}
			System.out.println("infinity loop");
		}
	}

}
