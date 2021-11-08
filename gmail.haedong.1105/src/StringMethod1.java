
public class StringMethod1 {
	public static void main(String[] args) {
		//문자열의 일치 여부 확인
		String str1 = "hae";
		String str2 = "HAE";
		String str3 = " HAE ";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		//문자열의 일치 여부를 비교할 때는 좌우 공백을 제거하고 대소문자를 하나로 통일하고 하는것이 좋다. 비밀번호는 예외 
		System.out.println(str1.trim().toUpperCase().equals(str2.trim().toUpperCase()));
		System.out.println(str1.trim().toUpperCase().equals(str3.trim().toUpperCase()));
		
		
		//대소문자 변환을 하지 않은 상태에서 크기 비교를 하면 소문자가 크다고 나옴
		System.out.println(str1.compareTo(str2));
		//크기 비교한 결과가 앞의 것이 크면 앞의 것이 크다, 같으면 같다, 작으면 작다 와같은 형태로 출력하기 
		int result = str1.compareTo(str2);
		if( result > 0) {
			System.out.println("str1이 더 크다");
		} else if( result == 0) {
			System.out.println("str1이 str2와 같다");
		}else {
			System.out.println("str2가 더 크다");
		}
		
		
		
	}
}
