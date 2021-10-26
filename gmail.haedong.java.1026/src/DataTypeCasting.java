
public class DataTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 변수에 실수 데이터 삽입 - 에러
//		int age = 517.1;
		
		//실수 변수에 정수 데이터를 대입 - 자동 형변환
		double height = 168;
		System.out.println("키는 " + height + "cm");
		
		//강제 형변환
		int age = (int)51.7;
		System.out.println(age);
		
		double h = (int)168.5;
		System.out.println(h);
		
		//표현범위 밖의 숫자를 강제로 변환해서 대입하면 overflow나 underflow 발생
		//overflow : 가장 큰 쪽으로 너어가서 자강 작은 것부터 다시 시작
		//underflow : 반대 
		byte b = (byte)128;
		System.out.println(b);
		b = (byte) - 130;
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
