import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileProcessing {
	public static void main(String[] args) {
		//출력할 파일 스트림 생성
		FileOutputStream fos = null;
		 
		
		//현재 작업 디렉터리에 bytefile.txt로 설정
		try {
			//출력할 파일 스트림 생성
			//현재 작업 디렉토리에 
			fos = new FileOutputStream("../../Desktop/Java/java/IOFile_ex/bytefile.txt", true);
			//기옥할만한 ㅁ누자열을 생성 
			String str= "안녕하세요 반갑습니다. ";
			String str1 = "dfasfawefaf";
	
			fos.write(str.getBytes());
			fos.write(str1.getBytes());
		} catch (Exception e) {
			System.out.println("파일의 경로를 확힌해 보세");
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("../../Desktop/Java/java/IOFile_ex/bytefile.txt");
			//avauilable을 통해서 읽을 수 있는 바이트의 수를 리턴 해서 바이트 배열 b에 대입 
			byte[] b = new byte[fis.available()];
			
			//read : 한 바이트씩 읽어서 읽은 데이터를 정수로 리턴 
			int len = fis.read(b);
			if(len <= 0) {
				System.out.println("읽을 데이터가 없음");
			}else {
				String str = new String(b);
				System.out.println(str);
			}
			
			
		}catch(Exception e) {
			{
				try {
					fis.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		
		
	}
}
}
