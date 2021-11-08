
public class SystemMethod {
	public static void main(String[] args) {
		// 운영체제 이름 확인
		System.out.println("OS : " + System.getProperty("os.name"));
		System.out.println("java version : " + System.getProperty("java.version"));

		// 시간 측정
		// 현재 시간
		long start = System.nanoTime();
		// 작업 수행
		//21억이 넘거나 -21억 보다 작은 정수를 표현하고자 하면 long을 사용하면 되데 숫자를 작성할 때는 뒤에 L을 붙여야 한다 
		for (int i = 0; i < 1000000000; i += 1) {

		}

		// 현재 시간
		long end = System.nanoTime();
		// 뒤의 시간에서 앞의시간을 빼면 작업을 수행하는데 걸린 시간

		// 현재 시간
		long start1 = System.nanoTime();
		// 작업 수행
		for (int i = 0; i < 1000000000; i = i + 1) {

		}

		// 현재 시간
		long end1 = System.nanoTime();
		// 뒤의 시간에서 앞의시간을 빼면 작업을 수행하는데 걸린 시간

		System.out.println("작업 시간 : " + (end - start));
		System.out.println("작업 시간 : " + (end1 - start1));

	}
}
	