
public class StringMethod3 {
	public static void main(String[] args) {
		String filename1 = "String.png";
		String filename2 = "String";
		// 위 2개의 문자열에서 확장자 부분을 추출하는데 확장자가 없으면 없다고 출력
		String[] result = filename1.split("\\.");
		System.out.println(result[1]);

		if (result.length < 2) {
			System.out.println("확장자 없");
		} else {
			System.out.println(result[result.length - 1]);
		}

		String x = filename1.substring(7, 10);

		if (x.equals("png")) {
			System.out.println(x);
		} else {
			System.out.println("확장자 없음");
		}

		int idx = filename2.indexOf(6, 9);

		System.out.println(idx);

		if (idx == -1) {
			System.out.println("확장자 없");
		} else {
			System.out.println(idx);
		}

		try {

		} catch (ArrayIndexOutOfBoundsException e) {
			filename2 = filename2 + " ";
		}

	}
}
