import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

//title 과 genre를 저장할 DTO클래스 
class Movie {
	private String title;
	private String genre;
	private String actor;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the actor
	 */
	public String getActor() {
		return actor;
	}

	/**
	 * @param actor the actor to set
	 */
	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", actor=" + actor + "]";
	}

}

public class MoiveJSONParsing {
	public static void main(String[] args) {
		// http://cyberadam.cafe24.com/movie/list 에서 데이터 파싱하기
		// title, actor 파싱해 보기

		// 1.web의 문자열 가져오기
		// 가져온 문자열을 저장할 변수
		String json = null;
		try {
			// 다운로드 받을 URL을 만들기
			// 여기까지 작성하고 실행 - URL 형식이 잘못되었으면 예외 발생
			URL url = new URL("http://cyberadam.cafe24.com/movie/list");

			// 연결
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(3000);
			con.setUseCaches(false);

			// 스트림 생성 - 문자열
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			// 문자열을 임시로 저장할 인스턴스 생성
			StringBuilder sb = new StringBuilder();

			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				sb.append(line);
				sb.append("\n");
			}
			json = sb.toString();
			// System.out.println(json);

		} catch (Exception e) {
			System.out.println("1:" + e.getLocalizedMessage());
		}

		// 2.가져온 문자열 파싱 - 원하는 모양으로 만들기

		if (json != null) {
			try {
				// 전체 문자열을 객체로 변
				JSONObject obj = new JSONObject(json);
				// 원하는 데이터는 객체 안의 list라는 이름의 배열로 존재
				JSONArray list = obj.getJSONArray("list");

				List<Movie> M_list = new ArrayList<>();

				// 배열을 순회
				for (int i = 0; i < list.length(); i++) {
					JSONObject movie = list.getJSONObject(i);

					String title = movie.getString("title");
					String genre = movie.getString("genre");
					// String actor = movie.getString("actor");

					// 하나의 행을 저장할 인스턴스를 생성

					Movie movie1 = new Movie();
					movie1.setTitle(title);
					movie1.setGenre(genre);
					M_list.add(movie1);

					try {
						//actor 는 String 인데 데이터 중에 null 값이 있어서 그냥 구하게 되면 오류가 발생 하게 되므로 예외처리를 통하여 null값을 무시 
						String actor = movie.getString("actor");
						// System.out.println(title + " : " + genre + "=" + actor);
					} catch (Exception e) {
						// System.out.println(title + " : " + genre + "=");
					}

				}

				for (Movie m : M_list) {
					System.out.println(m);
				}

			} catch (Exception e1) {
				System.out.println("2:" + e1.getLocalizedMessage());
			}
		}

	}
}
