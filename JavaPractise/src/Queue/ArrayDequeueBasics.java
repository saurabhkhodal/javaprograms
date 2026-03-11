package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeueBasics {

	public static void main(String[] args) {
		ArrayDeque <Integer> adq = new ArrayDeque<>();
		
		adq.offer(25);
		adq.offerFirst(12);
		adq.offerLast(45);
		adq.offer(40);
		
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		
		
     	System.out.println(adq.poll());
		System.out.println(adq.pollFirst());
		System.out.println(adq.pollLast());
		
System.out.println(adq);
	}

}
