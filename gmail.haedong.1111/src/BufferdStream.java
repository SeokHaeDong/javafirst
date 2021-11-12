import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class BufferdStream {
	public static void main(String[] args) {
		//파일에 바이트 단위로 버퍼를 이용해서 기록 - PrintStream
		PrintStream ps = null;
		
		try {
			//상대 경로를 이용해서 기록할 파일 스트림을 생성
			//현재 작업 디렉토리에 생성한다 -> ./ 이 현재 디렉터리를 가리킨다 
			ps = new PrintStream("../../Desktop/Java/java/IOFile_ex/BufferStream.txt");
			//기록할 내용 만들기
			String str = "버퍼를 이용한 바이트 스트림";
			//기록 -  문자열을 기록하는 메서드가 존재
			ps.println(str);
			
		}catch(Exception e) {
			System.out.println("파일 경로가 정확한지 확인해 주세요");
		}finally {
			ps.close();
		}
		
		
		//파일에서 바이트 단위로 버퍼를 사용해서 읽기 - BufferedInputStream
	BufferedInputStream bis = null;
	
	try {
		//절대 경로를 이용해서 생성하기 
		//윈도우는 \
		//다른 시스템은 / 부터 시작하고 
		FileInputStream fis = new FileInputStream("/Users/haedong/Desktop/Java/java/IOFile_ex/BufferStream.txt");
		
		
		bis = new BufferedInputStream(fis);
		
		//한 번에 읽기 
		byte[] b = new byte[bis.available()];
		//읽어서 저장하기 
		int len  = bis.read(b);
		
		
		//읽어낸 바이트 배열을 문자열로 만들기 
		String result = new String(b, 0, len);
		
		//읽은 내용을 출력
		System.out.println(result);
		
	}catch(Exception e) {
		System.out.println("파일 경로를 확인 해 주세요");
	}finally {
		
	}
	
		
	}
}
