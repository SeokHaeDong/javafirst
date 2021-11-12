import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {
	public static void main(String[] args) {
		
		try {
			//자신의 IP 정보
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
			
			//naver의 IP 정보
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress n : naver) {
				System.out.println( "Naver : " + n.toString());
			}
			
			
			//daum의 IP 정보
			InetAddress[] daum = InetAddress.getAllByName("www.daum.net");
			
			for(InetAddress d : daum) {
				System.out.println( "daum : " + d.toString());
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
