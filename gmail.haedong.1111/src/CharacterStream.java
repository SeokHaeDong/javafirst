import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CharacterStream {
	public static void main(String[] args) {
		//문자 단위로 기록 - 버퍼를 사용 : PrintWriter
		//파일의 경로를 서정 - 현재 디렉터리에 character.txt
		PrintWriter ps = null;
		try {
			//스트림을 생성
			ps = new PrintWriter("./character.txt");
			//기록할 메시지 
			String msg = "생성한 파일에\n데이터 추가\n하기";
			ps.write(msg);
			//내용이 많을 때는 마지막 내용이 기록이 안될수 있으므로 버퍼를 비워준다 
			ps.flush();

		}catch(Exception e) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String time = sdf.format(date);
			System.out.println(time + " : 파일의 경롤르 확인");
			//서버에서는 메시지를 파일이나 데이터베이스에 기록 - 시간과 함께

		}finally {
			ps.close();
		}

		//줄 단위로 텍스트를 읽기 
		//텍스트를 읽을 때 확인 사항 - BufferedReader
		//1.경로 확인 - 현재 디렉토리에 character.txt	
		//2.한글포함 여부 확인 - 인코딩을 확인(읽은 후 글자가 깨지면 인코딩을 수정)
		//3. 파일의 크기가 크면 한번에 읽지 못하거나 시간이 오래 걸리거나 컴퓨터가 버벅임 

		BufferedReader br = null;

		try {

			br = new BufferedReader(new InputStreamReader(new FileInputStream("./character.txt"), "UTF-8")); 
//			String str = "버퍼 생성 및\n인코딩 방식 지정"; //줄 단위로 읽어서 출력
			/*
			 * while(true) { String result = br.readLine(); if(result == null) { break; }
			 * System.out.println(result); }
			 */

		//줄 단위로 읽어서 바로 출력하지 않고 변수에 저장 
		String data = "";
		StringBuilder sb = new StringBuilder();
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			//문자열에 문자열을 + 하면 메모리 낭비가 발생 할 수 잇음 
			//data = data + line + "\n";

			//StringBulider를 이용해서 추가 
			sb.append(line);
			sb.append("\n");

		}
		
		data = sb.toString();
		System.out.println(data);


	}catch(

	Exception e)
	{
		System.out.println("파일 이름을 확인하세요");
	}finally
	{
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}}
