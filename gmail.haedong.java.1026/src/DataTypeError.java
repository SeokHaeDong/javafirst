
public class DataTypeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수를 생성하고 데이터를 저장 후 출력
		char ch = 'F';
		System.out.println("ch는 "+ ch);
		
		//ch변수 이미 선언되어 있음 
//		char ch = 'a';
		//변수명을 고친다 
		char character = 'a';
		//변수를 재사용 
		ch = 'a';
		
		//데이터 타입 불일치
//		ch = 97.1;
		//실수 변수를 만든다
		double d = 97.1;
		//char로 변경
		ch = (char)97.1;
		System.out.println(ch);
		
		//존재하지 않는 변수 출력
//		System.out.println(cl);
		//변수를 생성 / 있는 변수를 출력 
		
		
		//13이나 30은 Enter
		char temp = 13;
		System.out.println(temp);
		
//		int array[] = {1,2,3,4,5};
//		System.out.println(array[4]);
			
	}

}
