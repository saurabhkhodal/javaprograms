package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {

	public static void main(String[] args) {
		Queue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());          //this function compares the values and arrange them in reverse order
		
		pq.offer(35);
		pq.offer(65);
		pq.offer(63);
		pq.offer(53);
		pq.offer(78);
		
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		pq.peek();
		System.out.println(pq.peek());
		
		

	}

}
