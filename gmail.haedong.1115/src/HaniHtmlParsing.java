import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HaniHtmlParsing {
	public static void main(String[] args) {
		// 한겨게 신문사 main 기사의 타이틀 가져오기

		// 1. HTML가져오기
		String html = null;
		try {
			URL url = new URL("https://www.hani.co.kr/");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(3000);
			con.setUseCaches(false);

			// 스트림 생성 - 문자열
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			// 문자열을 임시로 저장할 인스턴스 생성
			StringBuilder sb = new StringBuilder();

			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				sb.append(line);
				sb.append("\n");
			}
			html = sb.toString();
//			System.out.println(html);

		} catch (Exception e) {
			System.out.println("1:" + e.getLocalizedMessage());
		}
		
		if(html != null) {
			try {
				//HTML을 Document 객체로 변환
				
				Document doc = Jsoup.parse(html);
				
				//main 기사 찾아오기 
				Elements elements = doc.select("#main-top > div.main-top > div.main-top-article > h4 > a");
				
				//순회
				for(int i = 0; i < elements.size(); i++) {
					Element element = elements.get(i);
					//태그 안의 내용
					System.out.println(element.text());
					//태그 안의 속성
					System.out.println(element.attr("href"));
				}
			
			}catch(Exception e1) {
				System.out.println("2:" + e1.getLocalizedMessage());
			}
		}
		
		
		
	}
}
