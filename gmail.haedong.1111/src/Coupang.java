import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Coupang {
	public static void main(String[] args) {
		// 웹 로그 분석
		BufferedReader br = null;

		try {

			// br에 log.txt 파일을 연결해서 인스턴스를 생성해서 대입
			// 파일을 현재 작업 디렉터리에 복사해서 수행
			// 파일 위치르 다른곳에 두고 상대경로로 파일의 위치 찾아 줌
			br = new BufferedReader(new InputStreamReader(new FileInputStream("../../Desktop/Java/java/1111/log.txt")));

			// 파일의 내용을 전부 읽어서 출력
			String data = "";
			StringBuilder sb = new StringBuilder();

			// 접속한 IP(컴퓨터) 개수를쎄기 위한 Set 자료구조 생성
			Set<String> ip_cnt = new HashSet<>();
			

			long traffic_sum = 0;

			// 데이터 개수를 저장하기 위한 변수를 생성
			int cnt = 0;
			while (true) {
				// 한 줄 읽기
				String line = br.readLine();

				// 읽은 데이터가 없으면 종료
				if (line == null) {
					break;
				}
				// 읽은 데이터가 있으면 sb에 저장
				sb.append(line);
				sb.append("\n");
				// 데이터 객수 1증가
				cnt += 1;

				// 읽어 낸 다음 문자열을 공백을 기준으로 분할
				String[] line_arr = line.split(" ");
				// System.out.println(line_arr[0] + " : " + line_arr[9]);

				ip_cnt.add(line_arr[0]);
				
				// 숫자로 변환되지 않는 데이터를 "0" 으로 치환
				/*
				 * if(line_arr[9].equals("-") || line_arr[9].equals("\"-\"")) { line_arr[9] =
				 * "0"; }
				 */

				// 예외처리 잘못된 값이 있으면 그냥 넘겨 버린다
				try {
					traffic_sum += Integer.parseInt(line_arr[9]);
				} catch (Exception e) {

				}

			}

			data = sb.toString();
			System.out.println(data);
//			System.out.println("파일의 크기 : " + (data.length() / 1024));

			// 데이터 개수를 출력
//			System.out.println("데어터 개수  : " + cnt);

			// String data = "";
			// StringBuilder sb = new StringBuilder();

			System.out.println("IP의 개수 : " + ip_cnt.size());
			System.out.println(ip_cnt);

//			System.out.println("트래픽의 합계 : " + traffic_sum);

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//try()안에서 생성된 인스턴스 중에서 AutoCloseable 인터페이스를 구현한 인스턴스는 마지막에 close를 자동으로 호출한다 
		try(Scanner sc = new Scanner(System.in)){
			sc.nextInt();
		}catch(Exception e){}
		
		
	}
}
