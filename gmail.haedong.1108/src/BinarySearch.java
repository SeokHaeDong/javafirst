import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] ar = {20,30,40,10,90,80,43,24,54,66};
		//정렬을 하지 않은 상태에서의 이분 검색
		System.out.println(Arrays.binarySearch(ar, 66));
		
		Arrays.sort(ar);

		for(int imsi : ar) {
			System.out.print(imsi + " ");
		}
		
		//int[] ar = {10,20,24,30,40,45,54,66,80,90};
		System.out.println("\n" + Arrays.binarySearch(ar, 66));
		
		
		
	}
}
