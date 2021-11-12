import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownload {
	public static void main(String[] args) {
		
		
		try {
			//다운로드 받을 URL 생
			URL url = new URL("https://cdn.mkhealth.co.kr/news/photo/202102/52163_52859_5928.jpg");
			//연결 객체 생
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			//옵션 설정
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
			//이미지 파일이므로 BufferedInputStream 생성
			BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
			
			//파일에 기록할 스트림 생성
			PrintStream ps = new PrintStream("./dog.jpg");
			
			while(true) {
				//버퍼를 생
				byte[] b = new byte[1024];
				//버퍼 크기 만큼 읽기 
				int len = bis.read(b);
				//읽은 데이터가 없으면 종료
				if (len <= 0) {
					break;
				}
				//읽은 데이터를 기록 - 읽은 만큼만 기록 
				ps.write(b, 0, len);
			}
			
			ps.flush();
			ps.close();
			bis.close();
			con.disconnect();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			
		}
	}
}
