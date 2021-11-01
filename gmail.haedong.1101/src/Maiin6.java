
public class Maiin6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 20;
		int n2 = 30;
		//n1과 n2는 기본형 데이터라서 메서드를 호출해도 결과가 변경되지 않습니다. 
		ParameterType.valueSwap(n1, n2);
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		int [] ar = {100, 200, 300};
		
		
		ParameterType.refSwap(ar);
		System.out.println("ar[0] : " + ar[0]);
		System.out.println("ar[1] : " + ar[1]);
	}

}
