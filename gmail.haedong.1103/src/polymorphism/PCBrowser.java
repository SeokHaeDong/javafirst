package polymorphism;

public class PCBrowser extends ProgressiveWeb{
	@Override
	public void nextPage() {
		super.nextPage();
		System.out.println("다음 페이지 번호 클릭");
	}
}
