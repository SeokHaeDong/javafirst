
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DTO 인스턴스 2개 생성
		DTO obj = new DTO();
		obj.setNumber(0);
		obj.setName("abc");
		
		DTO obj1 = new DTO();
		obj1.setNumber(0);
		obj1.setName("abc");
		
		System.out.println(obj);
		System.out.println(obj1);
		
		
		System.out.println(obj.equals(obj1));
		//각각 new를 사용해서 생성자를 호출했기에 메모리 영역을 별도로 차지하고 있어서 false
		System.out.println(obj == obj1);
		//2개의 내용이 같은지 확인 - 인스턴스의 클래스에 equals메서드를 재 정의 하고 그 메서드를 통해서 비교하면 된다 
		
		int x = 100;
		int y = x; //x를 복사한것이 아닌 x가 가진 데이터 100을 y가 가리키도록 
		y = 200;
		System.out.println(x);
		System.out.println(y);
		
		// 값과 참조 복사
		int [] ar = {100, 200, 300};
		int [] br = ar; //ar 이 가르키고 있는 100,200,300의 대표이름을 가리키도록 한것 
		
		br[0] = 123; //br이 가리키고 있는 첫번째 데이터를 123으로 수정 
		System.out.println(ar[0]);
		//참조를 복하새 주었으므로 참조를 받은 곳에서 참조를 이용해서 세부 데이터를 수정하면 원본 데이터도 수정된다  - call by reference
		System.out.println(br[0]);
		
		
		DTO a = new DTO();
		a.setNumber(1);
		a.setName("qqq");
		
		DTO b = a; //참조를 복사
		//a와 b는 동일한 인스턴스 
		b.setNumber(2);
		
		System.out.println(a);
		System.out.println(b);
	
		//복제 
		DTO a_1 = a.clone();
		a_1.setNumber(344);
		
		//복제를 했으므로 데이터 변경을 해도 원본 데이터에는 영향이 없음  
		System.out.println(a);
		System.out.println(a_1);
		
		
		
	}

}
