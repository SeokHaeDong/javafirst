import org.json.JSONArray;
import org.json.JSONObject;

public class JsonMain {
	public static void main(String[] args) {
		//JSON Object
		String json = "{\"name\" : \"hae\", \"age\" : 25}";
		//문자열 전체를 JSONdmfh qusghks
		JSONObject obj = new JSONObject(json);
//		System.out.println(obj);
		
		//객체는  key-name 을 대입해서 세부 데이터를 가져온다
		String name = obj.getString("name");
		int age = obj.getInt("age");
		
		System.out.println(name);
		System.out.println(age);
		
		//정수 배열로 만들어진 json 문자열
		String json1  = "[100,200,300,400,500]";
		
		JSONArray ar = new JSONArray(json1);
		
		for(int i = 0; i < ar.length(); i++) {
			int su = ar.getInt(i);
			System.out.println(su);
		}
		
		System.out.println("=====================================================================");
		
		//  String json = "{\"count\":20, "\"list\":[{\"name\":\"adam\"}, {\"name\":\"rusia\"}]}";
		String json2 = "{\"count\" : 20, \"list\" : [{\"name\" : \"hae\"}, {\"name\" : \"dong\"}]}";
		//객체  - {count : 20, list[{name:hae},{name:dong}]}
		
		JSONObject obj1 = new JSONObject(json2);
		//count는 정수 이므로 바로 읽을 수 있다
		int count = obj1.getInt("count");
		System.out.println(count);
		
		//list는 대괄호로 되어 있다. 
		JSONArray list = obj1.getJSONArray("list");
		
		//배열 순회
		for(int i = 0; i < list.length(); i++) {
			//배열의 요소들을 객체로 가져오기 
			JSONObject temp = list.getJSONObject(i);
			//name 키의 데이터를 문자열로 가져로기
			String name1 = temp.getString("name");
			System.out.println(name1);
		
		}
		
		
		
	}
}
