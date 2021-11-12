import java.util.HashMap;
import java.util.Set;

public class MapUse {
	public static void main(String[] args) {
		//Key는 String 으로 하고 Value는 Object로 하는 HashMap을 생성
		//Value를 object로 하는 이유는 모든 데이터를 삽입 가능하기 때문이고 대신 출력을 할때를 제외하고는 강제 형 변환을 통해서 원래의 자료형으로 되돌려서 사용해야함 
		//생
		HashMap<String, Object> map = new HashMap<String, Object>();
		//데이터 삽
		map.put("name", "hae");
		map.put("age", 25);
		map.put("age", 24); //age에 데이터를 저장했는데 다시 저장하면 수정 
		// 데이터 꺼내기
		String name = (String)map.get("name");
		int age = (int)map.get("age");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		
		//데이터 추가
		map.put("song","qwer");
		String[] albums = {"mini1","mini2"};
		map.put("album", albums);
		//toString 메서드 : 각 요소의 toString 메서드를 호출한 결과 
		System.out.println(map);
		
		//없는 key를 사용하면 null 리턴
		System.out.println(map.get("hobby"));
		
		
		//데이터 삭제 
		map.remove("album");
//		map.put("album", null); //get으로 꺼내면 null이기 때문에 지운것으로 간주, 하지만 실질적으론 남아있음
		System.out.println(map);
		
		//전체 데이터 순회 - key의 이름을 기억하지 않아도 된다 
		Set<String> keys = map.keySet(); //모든 key를 가져온다
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
	}
}
