import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiver {
	public static void main(String[] args) {
		//UDP 전송에 사용할 데이터 
		DatagramPacket packet = null;
		//Multicast 전송에 사용할 소켓
		MulticastSocket socket = null;
		
		try {
			//MulticastSocket 인스턴스 생
			socket = new MulticastSocket(10000);
			//참여활 IP 생
			InetAddress address = InetAddress.getByName("224.128.1.5");
			//그룹에 참여 
			socket.joinGroup(address);
			
			//무한반복해서 읽기
			while(true) {
				//데이터를 저장할 버퍼 생
				byte[] b = new byte[512];
				packet= new DatagramPacket(b, b.length);
				//데이터 받기
				socket.receive(packet);
				//데이터 해석
				String msg = new String(b, 0, packet.getLength());
				
				System.out.println(msg);
			}
			
			
			
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}finally{
			socket.close();
		}
	}
}
