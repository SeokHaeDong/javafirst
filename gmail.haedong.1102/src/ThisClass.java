public class ThisClass {
	private int num;

	public void method(){
		int num = 100;
		//num이 2개라서 가까이서 만듬 num을 찾
		System.out.println("num : " + num); //100
		//		num = 10;
		System.out.println("this.num : " + this.num);//외부에서 부터 찾기 때문에 0
		//this. 를 이면 메서드 내부에서는 찾지 않고 메서드 외부에서부터 찾아서 사용 
	}
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("new가 호출될 때 마다 호출");
	}
}
