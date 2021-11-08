import java.util.PriorityQueue;
import java.util.Stack;

public class StackQueueMain {
	public static void main(String[] args) {
		//문자열 저장하는 Stack 생성
		Stack<String> stack = new Stack<>();
		//데이터 추가 
		stack.push("stack");
		stack.push("data");
		stack.push("push");
		stack.push("test");
		
		
		//데이터를 삭제하면서 꺼내기 
		//더 이상 데이터가 없는데 pop을 하면 underflow 	발생
		String name = stack.pop();
		System.out.println(name);
		name = stack.pop();
		System.out.println(name);
		
		System.out.println("==========================================");
		
		//일반 큐는 ArrayList를 만들고 remove(0)을 하면 됨
		//우선순위 큐는 데이터를 크기 순서대로 꺼내주는 큐 -> 데이터를 순서대로 저장하는 것은 아니다. 
		//순서대로 저장되는 것이 아니다. 
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.offer("KOREA");
		queue.offer("CHINA");
		queue.offer("USA");
		queue.offer("NEWZILAND");
		queue.offer("HOLLAND");
		queue.offer("MONGOLIA");
		
//		System.out.println(queue);
		//우선순위가 가장 낮은 CHINA를 꺼내 온다.(삭제하면서 리턴)
		System.out.println(queue.poll());
		
		System.out.println("===========================================");
		
		for(String temp : queue) {
			System.out.println(temp);
		}
		
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		
		System.out.println(queue);
		
		
		
	}
}
