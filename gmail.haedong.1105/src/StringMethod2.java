
public class StringMethod2 {
	public static void main(String[] args) {
		String str = "hello String";
		//str의 길이를 출
		int str_len = str.length();
		System.out.println(str_len);
		char x = str.charAt(0);		
		//str의 첫 글자가 대문자인지 판별
		if( x >= 'A' && x <= 'Z') {
			System.out.println("대문자");
		}else {
			System.out.println("소문자");
		}
		//str의 첫글자가 영문자인지 판
		if( x >= 'A' && x <= 'Z' || x >= 'a' && x <= 'z') {
			System.out.println("영문자");
		}else {
			System.out.println("영문자 아님");
		}
		
		
 	}
}
