package polymorphism;

public class MobileBrowser extends ProgressiveWeb {
	
	@Override
	public void nextPage() {
		super.nextPage();
		System.out.println("아래로 스크롤");
	}
}
