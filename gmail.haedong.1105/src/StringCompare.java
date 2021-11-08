
public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 과 StringBuilder 의 차이
		
		//1. 생성 
		String str = "My name is ";
		StringBuilder sb = new StringBuilder("My name is ");
		
		//2. 해시코드 출력
		System.out.println("str : " + str.hashCode());
		System.out.println("sb : " + sb.hashCode());
		
		//3. 문자열 추가 연산
		str = str + "dong";
		sb.append("hae");
		
		System.out.println(str);
		System.out.println(sb);
		
		//4.추가 연산을 한 후 해시코드 확인
		//문자열은 새로운 공간에서 작업을 수행하고 그 공간의 참조를 리턴하기에 해시코드가 변경
		System.out.println("str : " + str.hashCode());
		//StringBuilder는 현재공간에서 작업을 수행하기에 해시코드가 변하지 않는다 
		System.out.println("sb : " + sb.hashCode());
		
		
		
		
		
	}

}
