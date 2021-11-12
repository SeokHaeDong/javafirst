import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DataFrameMapuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Map<String, Object>> list = new ArrayList<>();

		Map<String, Object> map = new HashMap<>();
		map.put("name", "Java");
		map.put("description", "프로그램을 만들기 위한 언어");
		map.put("days", 15);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "Database");
		map.put("description", "데이터를 효율적으로 관리하기 위한 SW");
		map.put("days", 5);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "WebFrontEnd");
		map.put("description", "웹 브라우저에 출력하기 위한 기술");
		map.put("days", 7);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "JavaWeb");
		map.put("description", "Java를 이용해서 Web Server를 만들기 위한 기술");
		map.put("days", 8);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "Spring");
		map.put("description", "Java Application을 빠르게 구현할 수 있도록 해주는 프레임워크");
		map.put("days", 15);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "Java Web Application Project");
		map.put("description", "그 동안 배운 것들을 이용해서 프로젝트를 진행");
		map.put("days", 10);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "Python");
		map.put("description", "애플리케이션을 제작하기 위한 프로그래밍 언어");
		map.put("days", 10);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "데이터 수집 및 탐색");
		map.put("description", "데이터를 수집하고 확인하는 작업");
		map.put("days", 5);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "전처리 및 마이닝");
		map.put("description", "분석하기 좋게 데이터를 가공하고 마이닝");
		map.put("days", 5);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "AI");
		map.put("description", "머신러닝, 딥러닝");
		map.put("days", 20);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "프로젝트");
		map.put("description", "AI 관련된 서비스 구축");
		map.put("days", 20);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "Linux");
		map.put("description", "서버 및 클라이언트 용 운영체제");
		map.put("days", 0);
		list.add(map);

		map = new HashMap<>();
		map.put("name", "도커");
		map.put("description", "컨테이너");
		map.put("days", 0);
		list.add(map);

		for (Map<String, Object> temp : list) {
			System.out.println(temp.get("name") + " : " + temp.get("description"));
		}
		System.out.println("===================================================================================");
		
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			int size = i + 2;
			for (; i < size; i++) {
				if (i == list.size()) {
					break;
				}
				System.out.println(list.get(i));

			}
			if (i == list.size()) {
				break;
			}
			System.out.println("다음 페이지 데이터는 Enter를 누르면 보여집니다.");
			sc.nextLine();
		}

		System.out.println("===================================================================================");

		// map 안에 있는 sort오름차순 정렬
		list.sort(new Comparator<Map<String, Object>>() {

			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				// TODO Auto-generated method stub
				// 이렇게 내부 데이터를 다른 용도로 사용할 때는 형 변환해서 사용
				String front = (String) o1.get("name");
				String back = (String) o2.get("name");
				return front.compareTo(back);
			}

		});
		for (Map<String, Object> temp : list) {
			System.out.println(temp.get("name"));
		}

	}

}
