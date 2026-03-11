package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListBasics {

	public static void main(String[] args) {
		Queue <String> queue = new LinkedList<>();
		
		queue.offer("Saurabh");                      // to add the elements in the queue
		queue.offer("Hari");
		queue.offer("Harshal");
		queue.offer("Tukaram");
		queue.offer("Prasad");
	
		
       System.out.println(queue);
       
       queue.poll();                                //removes the first element in the queue
       System.out.println(queue);
       
 //      queue.clear();
       queue.remove();                            //Removes the first element in the queue but thows exception if the queue is empty
       System.out.println(queue);
       
       queue.peek();
       System.out.println(queue.peek());
       
    //   queue.clear();
       queue.add("Saurabh");                      //it also used but it can throw exception in some cases
       System.out.println(queue);
       
     queue.element();                             //to find the first element in the queue
     System.out.println(queue.element());
     
     
	}

}
