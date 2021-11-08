import java.util.Arrays;
import java.util.Comparator;

public class DTOMain {
	public static void main(String[] args) {
		//DTO 클래스 인스턴스 4개를 저장할 수 있는 배열을 생성
		DTO[] p = new DTO[4];
		p[0] = new DTO();
		p[0].setName("카리나");
		p[0].setAge(21);
		p[0].setBrith("2000/04/04");
		
		p[1] = new DTO();
		p[1].setName("윈터");
		p[1].setAge(19);
		p[1].setBrith("2002/10/23");

		p[2] = new DTO();
		p[2].setName("지젤");
		p[2].setAge(22);
		p[2].setBrith("1999/02/13");
	
		p[3] = new DTO();
		p[3].setName("닝닝");
		p[3].setAge(19);
		p[3].setBrith("2002/06/05");
		
//		System.out.println(Arrays.toString(p));
		
		for(DTO dto : p) {
			System.out.println(dto);
		}
		
		System.out.println("=================================================");
		
		//배열의 데이터 정렬은 Arrays.sort 메서드에 대입하고 Comparator 인터페이스를 이용해서 원하는 비교 메서드를 구현하면 정렬
		
		Arrays.sort(p, new Comparator<DTO>(){

			@Override
			public int compare(DTO o1, DTO o2) {
				// TODO Auto-generated method stub
				return o1.getBrith().compareTo(o2.getBrith());
			}
			
		});
		
		for(DTO dto : p) {
			System.out.println(dto);
		}
		
	}
}
