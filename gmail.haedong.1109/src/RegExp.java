
public class RegExp {
	public static void main(String[] args) {
		//영문 소문자로 시작하는 3글자를 확인
		
		//확인하기 위한 문자열
		String[] arr = {"abc", "asdf", "ASDS", "342", "3글자", "a  ", "  f"};
		
		//조회할 패턴 생성
		//소문자로 시작하는 3글자 
		String pattern = "^[a-z]..";
		
		for(String str : arr) {
			System.out.print(str.matches(pattern) + " ");
		}
		
		
	}
}
