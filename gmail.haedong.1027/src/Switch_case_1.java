
public class Switch_case_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu = 0;
		//final을 앞에 붙이면 읽기 전용 변수
		//읽기 전용 변수이름은 모두 대문자로 작성하는 것이 관례 
		final int KOREAN = 0;
		final int CHINESE = 1;
		final int SNACK = 2;
		final int JAPAN = 3;
		switch (menu) {
		case KOREAN:
			System.out.println("한식");
			break;
		case CHINESE:
			System.out.println("중식");
			break;
		case SNACK:
			System.out.println("분식");
			break;
		case JAPAN:
			System.out.println("일식");
			break;
		default:
			System.out.println("아무거나");
			break;
		}
	}

}
