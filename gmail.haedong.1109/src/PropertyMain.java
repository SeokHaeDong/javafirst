import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyMain {
	public static void main(String[] args) {
		//속성과 값을 문자열로 저장하는 인스턴스를 생성
		Properties prop = new Properties();
		
		prop.setProperty("name", "avc");
		prop.setProperty("age", "33");
		
		
		System.out.println(prop.getProperty("name"));
		//자바에서는 없는 속성을 읽으면 null, 속성과 값을 저장하는 자료구에서는 없는 속성의 값을 대입 해봐야 함, null이 리턴되는지 아니면 예외가 발생하는지 확인 
		System.out.println(prop.getProperty("hobby"));
		
		//파일 저장
		try {
			//출력할 파일 스트림을 생
			FileOutputStream fos = new FileOutputStream("./data.properties");
			prop.store(fos, "comment");
			
			//Properties의 내용을 XML로 저장 
			fos = new FileOutputStream("./data.xml");
			prop.store(fos, "comment");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
