import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilrInfo {
	public static void main(String[] args) {
		//절대경로로 가지고 File 인스턴스를 생성
			File f = new File("/Users/haedong/Desktop/Java_info.txt");
			//파일의 존재 여부 확인 
			if(f.exists()) {
				System.out.println("파일이 존재 합니다.");
				//파일의 마지막 수정 시간  - epoch time
				long time = f.lastModified();
				//epoch time을 Date로 변환
				Date date = new Date(time);
				//날짜를 원하는 문자열로 만들기
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String result = sdf.format(date);
				
				System.out.println(time);
				System.out.println(date);
				System.out.println(result);
				//파일의 크기를 출력 - KB 바이트 단위  : 1KB - 1024Byte
				long len = f.length();
				
				System.out.println("파일의 크기 : " + len/1024 + "KB");
				
				//상대 경로를 확인 
				f = new File("./Java_info.txt");
				System.out.println(f.delete());
				//현재 디렉터리에 있는 파일의 경로를 가지고 File 객체를 생성 하였다 . 
				//해당 작업 수행 전 파일을 먼저 복사를 하고 진행을 하여야 정상적인 값이 출력된다 
//				System.out.println(f.getAbsolutePath());
				
				
				System.out.println(f.exists());
			}else {
				System.out.println("파일이 존재하지 않음");
			}
			
	}
}
