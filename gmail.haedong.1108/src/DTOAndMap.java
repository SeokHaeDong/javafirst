import java.util.LinkedHashMap;
import java.util.Set;

public class DTOAndMap {
	public static void main(String[] args) {
		//데이터 생성 
		DTO dto = new DTO();
		dto.setName("hae");
		dto.setAge(25);
		
		//데이터 출력 - DTO는 반복문을 사용할 수 없음
		System.out.println("이름 : " + dto.getName() );
		System.out.println("나이 : " + dto.getAge() );
		
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("이름", "동");
		map.put("나이", 25);
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
		
		
		
	}
}
