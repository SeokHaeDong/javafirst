
public class MavenMain {
	public static void main(String[] args) {
		//MySQL 연동을 위한 라이브러리를 로드하는 프로그램
		System.out.println("MySQL JDBC로드하기");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL 드라이버 로드 성공");
		}catch(Exception e) {
			System.out.println("MySQL 드라이버 로드 실패");
			System.out.println(e.getLocalizedMessage());
			System.exit(0);
		}
	}
}
