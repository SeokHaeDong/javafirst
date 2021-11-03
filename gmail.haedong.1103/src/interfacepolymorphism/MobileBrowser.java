package interfacepolymorphism;

public class MobileBrowser implements ProgressiveWeb {
	
	@Override
	public void nextPage() {
		System.out.println("아래로 스크롤");
	}
}
