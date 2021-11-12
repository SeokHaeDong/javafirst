import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastSender {
	public static void main(String[] args) {
		//UDP 전송에 사용할 데이터 
		DatagramPacket packet = null;
		//Multicast 전송에 사용할 소켓
		MulticastSocket socket = null;
		
		try {
			
			//보내는 MuticastSockert 생
			socket = new MulticastSocket();
			//입력 받기 위한 생성
			Scanner sc = new Scanner(System.in);
			//대화명 입력 받기 
			System.out.print("대화명 입력 : ");
			String nick = sc.nextLine();
			//접속할 주소 생성
			InetAddress address = InetAddress.getByName("224.128.1.5");
			
			while(true){
				System.out.print("전송할 메시지 : ");
				String msg = sc.nextLine();
				if(msg.equals("종료")) {
					msg = nick + " 님이 퇴장하셨습니다.";
					//보내기 위한 데이터 생성 
					packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 10000);
					socket.send(packet);
					break;
				}else {
					msg = nick + " : " + msg;
					//보내기 위한 데이터 생성 
					packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 10000);
					socket.send(packet);
				}
			}
			
			
		
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}finally{
			socket.close();
		}

	}
}
