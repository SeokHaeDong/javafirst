
public class DataType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수를 저장하는 변수를 만들고 데이터를 대입
		int numebr = 20;
		System.out.println(numebr);
		double double_number = 51.2155;
		System.out.println(double_number);
		
		//같은 이름으로 다시 변수 생성 불가
//		int number = 0;
		//만들어진 변수에 다른 데이터 타입의 데이터 대입 불가
//		number = "ssdf";
		
		
		
		//문자열을 저장하는 변수를 만드록 데이터를 대입
		String name = "dong";
		System.out.println(name);
		String apple = "apple";
		System.out.println(apple);
		
		//문자 - 실제로는 정수로 저장
		char ch = 'A';
		System.out.println(ch);
		//ASCII코드 저장
		ch = 65;
		System.out.println(ch);
		
		//제어문자 사용
		System.out.print("Hello \n Java");
		System.out.print("\t welcome");
	}

}
