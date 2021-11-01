
public class PracticeMain {

	public static void main(String[] args) {
		//메서드 사용
		//static이 있는지 없는지 확인  : 인스턴스를 만들어야 하는지 그렇지 않은지 
		//()안에 매개변수가 있는지 확인 : 으면 맞는 데이터를 넣어주어야 함
		//리턴 타입이 void	인지 아닌지 : void가 아니면 결과를 변수에 저장하고 사용
		
		//1.Practice 클래스의 staticMethod 호출
			Practice.staticMethod();
		
		//2.Practice 클래스의 disp 호출
			Practice obj = new Practice();
			obj.disp();
		//3.Practice 클래스의 sum 메서드를 이용해서 1부터 100까지의 합계 출력
			obj.sum(100);
		//4.Practice 클래스의 prime 메소드를 호출해서 2부터 1000까지의 소수 개수 출력
			int result = obj.prime();
			System.out.println(result);
	}

}
