package interfacepolymorphism;

public class PCBrowser implements ProgressiveWeb{
	@Override
	public void nextPage() {
		System.out.println("다음 페이지 번호 클릭");
	}
}
