
public class For_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for (i = 0, j = 0; i < 3; i += 1, j += 1) {
			System.out.println("for");
		}

		// () 안의 내용을 생략하면 무한반복되거나 한번도행되지 않습니다
		for (;;) {
			try {
				System.out.println("무한반복");
			}catch(Exception e) {
			
			}
			
		}

	}
}