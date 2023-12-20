import java.util.*;

class QueueDS {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);

		System.out.println(q);

		System.out.println(q.poll());
		
		System.out.println(q);

		System.out.println(q.element());
		System.out.println(q.peek());
		
		System.out.println(q);
	}
}
