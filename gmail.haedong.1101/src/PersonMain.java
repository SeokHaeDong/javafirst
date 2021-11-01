
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한 사람의 전화번호만 저장
		Person p1 = new Person();
		p1.setNum(1);
		p1.setName("hae");
		p1.setPhone("01025613005");
		p1.setAddress("서울시 서초구");

		// 각 속성을 출력
		System.out.println(p1.getNum());
		System.out.println(p1.getName());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAddress());

		// 모든 속성 출력 = toString 호출
		System.out.println(p1);

		// 동일한 모양의 데이터를 여러 개 사용하고자 할 때는 배열(크키가 고정)이나 List(크기를 변경 시킬 수 있음)를 생각
		Person[] contacts = new Person[3];

		// 각각의 공간을 생성
		for (int i = 0; i < contacts.length; i++) {
			contacts[i] = new Person();
		}

		contacts[0].setNum(1);
		contacts[0].setName("머물이");
		contacts[0].setPhone("01023553425");
		contacts[0].setAddress("고속도로 길바닥");

		contacts[1].setNum(2);
		contacts[1].setName("주디기");
		contacts[1].setPhone("01084763928");
		contacts[1].setAddress("아파트입구");

		contacts[2].setNum(3);
		contacts[2].setName("왕초");
		contacts[2].setPhone("01058935738");
		contacts[2].setAddress("땅");

		for (Person imsi : contacts) {
			System.out.println(imsi);
		}

	}

}
