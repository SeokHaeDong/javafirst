import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain {
	public static void main(String[] args) {
		//ArrayList 와 LinkedList 속도 비교
		
		//ArrayList 와 LinkedList 생성
		ArrayList <Integer>al = new ArrayList<>();
		LinkedList <Integer>ll = new LinkedList<>();
		
		al.add(1);
		al.add(3);
		
		ll.add(1);
		ll.add(3);
		
		long start = System.nanoTime();
		//1000000 개의 데이터를 2번째에 삽입 
		for(int i = 0; i < 100000; i++) {
			al.add(1, 2);
		}
		
		long end = System.nanoTime();
		
		System.out.println("ArrayList 작업시간 : " + (end - start));
		
		start = System.nanoTime();
		
		for(int i = 0; i < 100000; i++) {
			ll.add(1, 2);
		}
		
		end = System.nanoTime();
		System.out.println("LinkedList 작업시간 : " + (end - start));
		System.out.println("======================================");
		
		start = System.nanoTime();
		
		for(int i = 0; i < 100000; i++) {
			al.get(1);
			}
		
		end = System.nanoTime();
		
		System.out.println("ArrayList 작업시간 : " + (end - start));
		
		start = System.nanoTime();
		
		for(int i = 0; i < 100000; i++) {
			ll.get(1);
		}
		end = System.nanoTime();
		
		System.out.println("LinkedList 작업시간 : " + (end - start));
		
		
		
		
		
		
		
		
	}
}
