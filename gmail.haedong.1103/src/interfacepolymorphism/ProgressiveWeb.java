package interfacepolymorphism;

//MobileBrowser, PCBrowser 클래스의 인스턴스를 모두 대입받기 위한 상위 클래스 
//추상클래스 - 인스턴스를 생성할 수 없
public interface ProgressiveWeb {
	//인스턴스가 접근할 수 있는 메서드를 만들어주기 위해서 만든 메서드
	//추상 메서드  : 하위클래스 에서는 반드시 이 메서드를 만들어야 
	//인터페이스에는 abstract가 없어도 추상 메서드가 된다
	public void nextPage();
}
