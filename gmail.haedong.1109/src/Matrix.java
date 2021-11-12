import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Matrix {
	public static void main(String[] args) {
		//여자배구 선수 명단을 팀별로 저장
		//여러 개의 팀이 존재하고 각 팀에는 여러명의 선수가 존재
		
		//각 팀 선수명단 
		String[] hipass = {"배유나","문정원","박정아"};
		String[] kixx = {"강소휘", "안혜진"};
		String[] kgc = {"엄혜선", "이소영", "한송"};
		//2개의 배열을 하나의 배열로 생성 - 동일한 성격을 갖는 데이터는 하나로 관리 
		String[][] volleyballs = {hipass, kixx, kgc};
		
		//데이터 출력 - 팀 순서 명단을 줄 단위로 출력
		//배열은 인덱스로 데이터를 찾아
		for(int i = 0; i < volleyballs.length; i++) {
		
			String[] players = volleyballs[i];
			if(i == 0) {
				System.out.print("도로공사 : " + " ");
			}else if(i == 1){
				System.out.print("GS : " + " ");
			}else {
				System.out.print("인삼공사 : " + " ");
			}
			
			for(String player : players) {
				System.out.print(player + " ");
			}
			System.out.println();
		}
		
		//변할 가능성이 있는 데이터를 2차원 배열로 만드는 것은 바람직하지 못함
		//1차원 배열과 배열의 특징을 나타내는 속성을 Map으로 묶고 이 Map을 배열로 묶어주는 것을 권장 
		Map<String, Object> map = new HashMap<>();
		//팀 이름을 나타내는 속성 
		map.put("name", "도로공사");
		//실제 데이터를 나타내는 소것
		map.put("data", hipass);

		Map<String, Object> map1 = new HashMap<>();
		//팀 이름을 나타내는 속성 
		map1.put("name", "GS");
		//실제 데이터를 나타내는 소것
		map1.put("data", kixx);
		
		Map<String, Object> map2 = new HashMap<>();
		//팀 이름을 나타내는 속성 
		map2.put("name", "인삼공");
		//실제 데이터를 나타내는 소것
		map2.put("data", kgc);
		
		Map[] maps = {map, map1, map2};
		
		for(Map temp : maps) {
			System.out.print(temp.get("name") + " : ");
			String[] arr = (String[]) temp.get("data");
			for(String player : arr) {
				System.out.print(player + " ");
			}
			System.out.println();
		}
		
		System.out.println("===================================================================================");
		
		//Map 에서 key에 달려있는 배열의 모든 값을 찾아오기 위해선 key의 이름으로 value의 값을 배열을 생성하여 저장해주고 나서 빠른 나열로 값을 전체 출력이 가능하다 
		String[] arr = (String[]) map.get("data");
		for(String temp : arr) {
			System.out.print(temp + " ");
		}
		
		
		System.out.println("\n"+"=============================");
		
		Set<String> keys = map.keySet(); //모든 key를 가져온다
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
	}
	
}
