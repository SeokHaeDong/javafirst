package abstractpolymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MobileBrowser mbrowser = new MobileBrowser(); mbrowser.nextPage();
		 * 
		 * PCBrowser pc = new PCBrowser(); pc.nextPage();
		 */
		
		ProgressiveWeb browser = new MobileBrowser();
		browser.nextPage();
		
		browser = new PCBrowser();
		browser.nextPage();
		
		//현재는 아래 문장이 가능
		//추상 클래스 나 인터페이스를 이용하면 아래 문장은 에러 
		/*
		 * browser = new ProgressiveWeb(); browser.nextPage();
		 */
		
	}

}
