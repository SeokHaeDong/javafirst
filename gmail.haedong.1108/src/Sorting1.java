import java.util.Arrays;
import java.util.Comparator;

public class Sorting1 {
	public static void main(String[] args) {
		String[] arr = { "아이린", "조이", "슬기", "웬디", "예리" };
		// 문자열 내림차순 정렬 = Arrays.sort 메서드 이
		// Comparator를 구현한 클래스 만들기

		class Temp implements Comparator<String> {
			// 문자열 내림차순 정렬 하기 위해서 순서를 변경해서 비교
			// 순서대로 비교한 결과에 -1을 곱해도
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				// return o1.compareTo(o2) * -1;
				return o2.compareTo(o1);
			}

		}
		Arrays.sort(arr, new Temp());
		System.out.println(Arrays.toString(arr));

		Integer[] ar_num = { 30, 20, 19, 24, 65, 27 };
		//내림차순 정렬
		class imsi implements Comparator<Integer> {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		}

		Arrays.sort(ar_num, new imsi());
		System.out.println(Arrays.toString(ar_num));

		Integer[] an_arr = { 24, 54, 76, 23, 63, 12 };

		Arrays.sort(an_arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}

		});
		System.out.println(Arrays.toString(an_arr));

	}

}
