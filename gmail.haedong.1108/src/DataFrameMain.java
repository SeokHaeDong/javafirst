import java.util.ArrayList;
import java.util.Comparator;

public class DataFrameMain {
	public static void main(String[] args) {
		//.1. DataFrame 만들기
		// boolean, byte, short, char, int, long, float, double, String  - 가로의 항목 
		// DTO Class - 가로
		// 배열, ArrayList, LinkedList - 세로 
		
		ArrayList<DTO> ar = new ArrayList<>();
		
		//2. 데이터 추가 
		DTO dto = new DTO();
		dto.setName("아이린");
		dto.setAge(30);
		dto.setBrith("1992/10/25");
		//마지막에 데이터 추가
		ar.add(dto);
		
		//새로운 데이터를 만들어서 dto에 대입 
		dto = new DTO();
		dto.setName("슬기");
		dto.setAge(27);
		dto.setBrith("1995/05/05");
		//마지막에 데이터 추가
		ar.add(dto);
		
		dto = new DTO();
		dto.setName("조이");
		dto.setAge(25);
		dto.setBrith("1997/01/11");
		//마지막에 데이터 추가
		ar.add(dto);
		
		dto = new DTO();
		dto.setName("웬디");
		dto.setAge(27);
		dto.setBrith("1995/10/25");
		//마지막에 데이터 추가
		ar.add(2, dto);
		
		dto = new DTO();
		dto.setName("예리");
		dto.setAge(23);
		dto.setBrith("1999/07/28");
		//마지막에 데이터 추가
		ar.add(dto);
		
		
		//모든 데이터 확인하기 
		//List의 toString은 재정의 되어 잇어서 모든 데이터의 toString을 하나의 문자열로 합쳐서 리턴 
		System.out.println(ar);
		
		
		for(DTO imsi : ar) {
			System.out.println(imsi);
		}
		
		System.out.println("=======================================");
		
		//데이터 개수 - size()
		//데이터 1개 가져오기 - get(int index)
		int len = ar.size();
		for(int i = 0; i < len; i++) {
			System.out.println(ar.get(i));
		}
		
		
		//데이터 수정 
		//set(int index, Data data)
		dto = new DTO();
		dto.setName("예리");
		dto.setAge(22);
		dto.setBrith("2000/07/28");
		ar.set(4, dto);
		
		
		
		for(DTO imsi : ar) {
			System.out.println(imsi);
		}
		
		System.out.println("=======================================");
		
		//데이터 삭제
		//remove(int index)
		ar.remove(4);
		
		for(DTO imsi : ar) {
			System.out.println(imsi);
		}
		
		System.out.println("=======================================");
		
		
		//데이터 정렬
		//sort(Comparator comparator)
		
		ar.sort(new Comparator<DTO>() {

			@Override
			public int compare(DTO o1, DTO o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
			
		});
		
		
		for(DTO imsi : ar) {
			System.out.println(imsi);
		}
		
		System.out.println("=======================================");
		
		//검색 - indexOf
		
		
		
		
		
		
		
		
		
		
	}
}
