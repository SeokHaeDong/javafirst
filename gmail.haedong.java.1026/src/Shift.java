
public class Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = 127;
		// << 2 는 *4 한것과 동일
		System.out.println(data << 3);
		// >> 2 는 /4 한것과 동일
		System.out.println(data >> 2);
		// >>34 는 32보다 크거나 같으므로 32로 나눈 나머지인 2와 동일
		System.out.println(data >> 34);

		int a = 10;
		int b = 10;
		System.out.println(a == b);
		// identityHashCode 는 객체의 고유한 hashCode를 리턴
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		int array_a[] = { 1, 2, 3, 4, 5 };
		int array_b[] = { 1, 2, 3, 4, 5 };

		System.out.println(array_a == array_b);
		System.out.println(System.identityHashCode(array_a));
		System.out.println(System.identityHashCode(array_b));

	}

}
