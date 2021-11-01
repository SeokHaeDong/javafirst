
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodClass_return obj = new MethodClass_return();

		// return 이 있는 경우는 결과를 다른 변수에 저장해서 사용하는 것이 일반적
		int result = obj.returnAdd(100, 300);
		// 결과를 출력

		System.out.println(result);
		// 이전 결과를 가지고 다시 더하기
		result = obj.returnAdd(result, 300);
		System.out.println(result);
	}

}