import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		Socket socket = null;
		try{
			System.out.print("전송할 메시지 : ");
			Scanner sc = new Scanner(System.in);
			String msg = sc.nextLine();
			
			// 192.168.20.127 <- My IP
			InetAddress address = InetAddress.getByName("192.168.20.98");
			//소켓 생
			socket = new Socket(address, 9000);
			//소켓을 이용해서 전송할 스트림 생
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			//문자열 전송
			pw.println(msg);
			pw.flush();
			
			
			pw.close();
			sc.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
